package jt.dk.kommunevalg3.repository;

import jt.dk.kommunevalg3.model.Kandidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryInterface extends JpaRepository<Kandidat, String> {
}
