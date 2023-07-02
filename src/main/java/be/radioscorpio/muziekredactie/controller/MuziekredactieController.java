package be.radioscorpio.muziekredactie.controller;

import be.radioscorpio.muziekredactie.domain.Lijst;
import be.radioscorpio.muziekredactie.service.interfaces.MuziekredactieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MuziekredactieController {

    @Autowired
    private MuziekredactieService muziekredactieService;

    @GetMapping("/test")
    public ResponseEntity<String> getTestData() {
        return ResponseEntity.ok("/test endpoint working");
    }

    @GetMapping("/list/{listId}")
    public ResponseEntity<Lijst> getTestData(String id) {
        return ResponseEntity.ok(muziekredactieService.getLijstById(id));
    }
}
