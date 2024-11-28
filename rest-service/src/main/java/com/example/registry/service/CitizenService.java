package com.example.registry.service;

import com.example.registry.domain.Citizen;
import com.example.registry.repository.CitizenRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CitizenService {
    private final CitizenRepository repository;

    public CitizenService(CitizenRepository repository) {
        this.repository = repository;
    }

    public Citizen saveCitizen(Citizen citizen) {
        return repository.save(citizen);
    }

    public void deleteCitizen(String id) {
        repository.deleteById(id);
    }

    public List<Citizen> searchCitizens(String lastName) {
        return repository.findAll(); // Placeholder
    }

    public Citizen findCitizen(String id) {
        return repository.findById(id).orElse(null);
    }
}
