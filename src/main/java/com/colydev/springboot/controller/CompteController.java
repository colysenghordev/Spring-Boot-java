package com.colydev.springboot.controller;

import com.colydev.springboot.model.Compte;
import com.colydev.springboot.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompteController {
    @Autowired
    private CompteRepository compteRepository;
    @PostMapping("/ajoutcompte")
    public Compte ajoutcompte(Compte compte){
        compteRepository.save(compte);
        return compte;
    }
    @GetMapping(value = "/listecompte")
    public List<Compte> liste(){
        return compteRepository.findAll();
    }

}
