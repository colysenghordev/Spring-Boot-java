package com.colydev.springboot.repository;

import com.colydev.springboot.model.Depot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepotRepository extends JpaRepository <Depot, Integer> {
}
