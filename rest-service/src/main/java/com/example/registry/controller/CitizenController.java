package com.example.registry.controller;

import com.example.registry.domain.Citizen;
import com.example.registry.service.CitizenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizens")
public class CitizenController {
    private final CitizenService service;

    public CitizenController(CitizenService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen citizen) {
        return ResponseEntity.ok(service.saveCitizen(citizen));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCitizen(@PathVariable String id) {
        service.deleteCitizen(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Citizen> getCitizen(@PathVariable String id) {
        return ResponseEntity.ok(service.findCitizen(id));
    }

    @GetMapping
    public ResponseEntity<List<Citizen>> searchCitizens() {
        return ResponseEntity.ok(service.searchCitizens(null));
    }
}
