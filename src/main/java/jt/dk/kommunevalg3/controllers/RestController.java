package jt.dk.kommunevalg3.controllers;


import jt.dk.kommunevalg3.model.Kandidat;
import jt.dk.kommunevalg3.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    RepositoryInterface repositoryInterface;

    //This output looks like S.., but just to use the @RestController
    @GetMapping("/top10")
    public List<Kandidat> top10(){

        return repositoryInterface.findAll();
    }

}
