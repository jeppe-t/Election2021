package jt.dk.kommunevalg3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kandidat {

    @Column
    @Id
    private String name;
    private String parti;
    private String opstillerIKommune;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParti() {
        return parti;
    }

    public void setParti(String parti) {
        this.parti = parti;
    }

    public String getOpstillerIKommune() {
        return opstillerIKommune;
    }

    public void setOpstillerIKommune(String opstillerIKommune) {
        this.opstillerIKommune = opstillerIKommune;
    }

}
