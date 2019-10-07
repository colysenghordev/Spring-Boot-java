package com.colydev.springboot.controller;

import com.colydev.springboot.model.*;
import com.colydev.springboot.repository.CompteRepository;
import com.colydev.springboot.repository.DepotRepository;
import com.colydev.springboot.repository.PartenaireRepository;
import com.colydev.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EntrepriseController {
    @Autowired
    private PartenaireRepository partenaireRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private DepotRepository depotRepository;
    @Autowired
    private PasswordEncoder encoderpassword;

    @PostMapping(value = "/ajoutentreprise")
    public ResponseEntity<String> entreprise(Entreprise entreprise){

        Partenaire partenaire = new Partenaire();
        partenaire.setNinea(entreprise.getNinea());
        partenaire.setRaisonsociale(entreprise.getRaisonsociale());
        partenaire.setStatus(entreprise.getStatus());
        partenaireRepository.save(partenaire);

        User user = new User();
        user.setUsername(entreprise.getUsername());
        user.setPassword(encoderpassword.encode(entreprise.getPassword()));
        user.setPrenom(entreprise.getPrenom());
        user.setNom(entreprise.getNom());
        user.setAdresse(entreprise.getAdresse());
        user.setTelephone(entreprise.getTelephone());
        user.setEmail(entreprise.getEmail());
        user.setPartenaire(partenaire);
        userRepository.save(user);

        Compte compte = new Compte();
        int x = (int)(Math.random()*((999999)+10));
        compte.setNumerocompte(x);
        compte.setSolde(entreprise.getMontant());
        compte.setPartenaire(partenaire);
        compteRepository.save(compte);

        Depot depot = new Depot();
        depot.setDatedepot(new Date());
        depot.setMontant(entreprise.getMontant());
        depot.setCompte(compte);
        depot.setUser(user);
        depotRepository.save(depot);

        return new ResponseEntity<>("L'entreprise a été ajoutée avec succés", HttpStatus.ACCEPTED);
    }
}
