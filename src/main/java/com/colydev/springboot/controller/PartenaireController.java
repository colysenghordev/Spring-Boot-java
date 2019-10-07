package com.colydev.springboot.controller;

import com.colydev.springboot.model.Partenaire;
import com.colydev.springboot.repository.PartenaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartenaireController {
    @Autowired
    private PartenaireRepository partenaireRepository;
    @PostMapping("/ajoutpartenaire")
    public Partenaire ajoutpartenaire(Partenaire partenaire){
        partenaireRepository.save(partenaire);
        return partenaire;
    }
    @GetMapping(value = "/listepartenaire")
    public List<Partenaire> liste(){
        return partenaireRepository.findAll();
    }
}
