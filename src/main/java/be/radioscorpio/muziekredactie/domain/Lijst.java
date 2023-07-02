package be.radioscorpio.muziekredactie.domain;

import lombok.*;

import java.util.List;

@Data
public class Lijst {

    String lijstId;
    List<LijstItem> lijstItems;
}
