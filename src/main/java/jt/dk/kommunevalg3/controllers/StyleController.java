package jt.dk.kommunevalg3.controllers;

import jt.dk.kommunevalg3.model.Kandidat;
import jt.dk.kommunevalg3.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

@Controller
public class StyleController {

    @Autowired
    RepositoryInterface repositoryInterface;
    ArrayList<Kandidat> kandidatListe = new ArrayList<>();
    Kandidat kandidat;

    //Displays the table with css styling
    @GetMapping("/")
    public String top10Table(Model model){
        kandidatListe.clear();
        kandidatListe = find();
        model.addAttribute("kandidat", kandidat);
        model.addAttribute("kandidater", kandidatListe);
     return "index";
    }

    //Retrieve data from database and fill the objects into a list.
    //Could also be done in ObjMapper class
    public ArrayList<Kandidat>find(){
        for (int i = 0; i < repositoryInterface.findAll().size(); i++) {
            kandidat = repositoryInterface.findAll().get(i);
            kandidatListe.add(kandidat);
        }
        return kandidatListe;
    }

}
