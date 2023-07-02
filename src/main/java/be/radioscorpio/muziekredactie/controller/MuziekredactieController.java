package be.radioscorpio.muziekredactie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MuziekredactieController {

    @GetMapping("/test")
    public ResponseEntity <String> getTestData() {
        return ResponseEntity.ok("/test endpoint working");
    }
}
