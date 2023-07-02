package be.radioscorpio.muziekredactie.repository;

import be.radioscorpio.muziekredactie.domain.Lijst;
import org.springframework.stereotype.Repository;

@Repository
public class MuziekredactieRepository {

    public Lijst getLijstById(String id) {
        return new Lijst();
    }
}
