package com.example.generator.domain;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter

public class User {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String address;

    private long vat;

    private long nif;

    private String email;

    private String country; // countrycode

}
