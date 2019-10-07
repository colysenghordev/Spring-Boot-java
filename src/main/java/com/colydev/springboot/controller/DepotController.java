package com.colydev.springboot.controller;

import com.colydev.springboot.model.Depot;
import com.colydev.springboot.repository.DepotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepotController {
    @Autowired
    private DepotRepository depotRepository;
    @PostMapping("/ajoutdepot")
    public Depot ajoutdepot(Depot depot){
        depotRepository.save(depot);
        return depot;
    }
    @GetMapping(value = "/listedepot")
    public List<Depot> liste(){
        return depotRepository.findAll();
    }
}
