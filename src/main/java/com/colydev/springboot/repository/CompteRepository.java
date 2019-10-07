package com.colydev.springboot.repository;

import com.colydev.springboot.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository <Compte, Integer> {
}
