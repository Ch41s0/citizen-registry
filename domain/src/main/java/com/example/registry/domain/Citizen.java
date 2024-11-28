package com.example.registry.domain;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class Citizen {
    @NotNull
    @Size(min = 8, max = 8)
    private String id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String gender;

    @NotNull
    private LocalDate birthDate;

    @Size(min = 9, max = 9)
    private String vatNumber;

    private String address;

    // Getters, Setters, Constructors, and toString()
}
