package be.radioscorpio.muziekredactie.service;

import be.radioscorpio.muziekredactie.domain.Lijst;
import be.radioscorpio.muziekredactie.repository.MuziekredactieRepository;
import be.radioscorpio.muziekredactie.service.interfaces.MuziekredactieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MuziekredactieServiceImpl implements MuziekredactieService {

    @Autowired
    private MuziekredactieRepository muziekredactieRepository;

    @Override
    public Lijst getLijstById(String id) {
        return muziekredactieRepository.getLijstById(id);
    }
}
