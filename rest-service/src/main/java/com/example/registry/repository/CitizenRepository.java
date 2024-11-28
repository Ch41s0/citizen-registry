package com.example.registry.repository;

import com.example.registry.domain.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen, String> {
}
