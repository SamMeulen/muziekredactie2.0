package be.radioscorpio.muziekredactie.repository;

import be.radioscorpio.muziekredactie.domain.Lijst;
import be.radioscorpio.muziekredactie.domain.LijstItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MuziekredactieRepository {

    public Lijst getLijstById(String id) {

        Lijst lijst = new Lijst();
        lijst.setLijstId("1");

        List<LijstItem> lijstItems = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            LijstItem lijstItem = new LijstItem();
            lijstItem.setLijstId("1");
            lijstItem.setLijstItemId(Integer.toString(i));
            lijstItem.setArtiest("Artiest " + i);
            lijstItem.setNummer("Nummer " + i);

            lijstItems.add(lijstItem);
        }
        lijst.setLijstItems(lijstItems);
        return lijst;
    }
}
