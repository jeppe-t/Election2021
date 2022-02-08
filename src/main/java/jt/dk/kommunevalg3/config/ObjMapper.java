package jt.dk.kommunevalg3.config;


import jt.dk.kommunevalg3.model.Kandidat;
import jt.dk.kommunevalg3.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ObjMapper implements CommandLineRunner {

    @Autowired
    RepositoryInterface repositoryInterface;

    @Override
    public void run(String... args) throws Exception {

        //Top 10 candidats
        //Hardcoded

        Kandidat kandidat = new Kandidat();
        kandidat.setName("Line Barfod, Nørrebro");
        kandidat.setParti("Ø");
        kandidat.setOpstillerIKommune("København");
        repositoryInterface.save(kandidat);

        kandidat.setName("Sophie Hæstorp Andersen");
        kandidat.setParti("A");
        kandidat.setOpstillerIKommune("København");
        repositoryInterface.save(kandidat);

        kandidat.setName("Jakob Næsager");
        kandidat.setParti("C");
        kandidat.setOpstillerIKommune("København");
        repositoryInterface.save(kandidat);

        kandidat.setName("Sisse Marie Welling");
        kandidat.setParti("F");
        kandidat.setOpstillerIKommune("København");
        repositoryInterface.save(kandidat);

        kandidat.setName("Astrid Aller");
        kandidat.setParti("F");
        kandidat.setOpstillerIKommune("København");
        repositoryInterface.save(kandidat);

        kandidat.setName("Lars Weiss");
        kandidat.setParti("A");
        kandidat.setOpstillerIKommune("København");
        repositoryInterface.save(kandidat);

        kandidat.setName("Ole Birk Olesen");
        kandidat.setParti("I");
        kandidat.setOpstillerIKommune("København");
        repositoryInterface.save(kandidat);

        kandidat.setName("Mia Nyegaard");
        kandidat.setParti("B");
        kandidat.setOpstillerIKommune("København");
        repositoryInterface.save(kandidat);

        kandidat.setName("Sinem Demir");
        kandidat.setParti("Ø");
        kandidat.setOpstillerIKommune("Vanløse, København");
        repositoryInterface.save(kandidat);

        kandidat.setName("Helle Bonnesen");
        kandidat.setParti("C");
        kandidat.setOpstillerIKommune("København");
        repositoryInterface.save(kandidat);

    }
}
