package be.radioscorpio.muziekredactie.controller;

import be.radioscorpio.muziekredactie.domain.Lijst;
import be.radioscorpio.muziekredactie.service.interfaces.MuziekredactieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MuziekredactieController {

    @Autowired
    private MuziekredactieService muziekredactieService;

    @GetMapping("/test")
    public ResponseEntity<String> getTestData() {
        return ResponseEntity.ok("/test endpoint working");
    }

    @GetMapping("/lijst/{lijstId}")
    public ResponseEntity<Lijst> getTestData(String lijstId) {
        return new ResponseEntity<>(muziekredactieService.getLijstById(lijstId), HttpStatus.OK);
    }
}
