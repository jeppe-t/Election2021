package jt.dk.kommunevalg3.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KandidatTest {

    Kandidat kandidat = new Kandidat();


    @Test
    void getName() {
        kandidat.setName("Test");
        assertEquals("Test", kandidat.getName());
    }

    @Test
    void getParti() {
        kandidat.setParti("testParti");
        assertEquals("testParti", kandidat.getParti());
    }

    @Test
    void getOpstillerIKommune() {
        kandidat.setOpstillerIKommune("testKommune");
        assertEquals("testKommune", kandidat.getOpstillerIKommune());
    }
}