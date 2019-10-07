package com.colydev.springboot.repository;

import com.colydev.springboot.model.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PartenaireRepository extends JpaRepository <Partenaire, Integer> {
}
