package com.colydev.springboot.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class Entreprise {
    @Column
    @Size(min=3, max = 50)
    private String raisonsociale;
    @Column
    @Size(min=3, max = 50)
    private String ninea;
    @Column
    @Size(min=3, max = 50)
    private String status;

    @NotBlank
    @Size(min=3, max = 50)
    private String username;
    @NotBlank
    @Size(min=3, max = 50)
    private String password;
    @NotBlank
    @Size(min=2, max = 50)
    private String prenom;
    @NotBlank
    @Size(min=2, max = 50)
    private String nom;
    @NotBlank
    @Size(min=3, max = 50)
    private String adresse;
    @NotBlank
    @Size(min=3, max = 50)
    private String telephone;
    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    private Partenaire partenaire;

    @Column(length = 10)
    private int numerocompte;
    @Column
    private double solde;

    private double montant;
    private Date datedepot;
    private User user;
    private Compte compte;

    public String getRaisonsociale() {
        return raisonsociale;
    }

    public void setRaisonsociale(String raisonsociale) {
        this.raisonsociale = raisonsociale;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Partenaire getPartenaire() {
        return partenaire;
    }

    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }

    public int getNumerocompte() {
        return numerocompte;
    }

    public void setNumerocompte(int numerocompte) {
        this.numerocompte = numerocompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDatedepot() {
        return datedepot;
    }

    public void setDatedepot(Date datedepot) {
        this.datedepot = datedepot;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
