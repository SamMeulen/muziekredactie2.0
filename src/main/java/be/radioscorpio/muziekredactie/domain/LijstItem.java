package be.radioscorpio.muziekredactie.domain;

import lombok.*;

@Data
@NoArgsConstructor
public class LijstItem {

    String lijstItemId;
    String lijstId;
    String artiest;
    String nummer;
}
