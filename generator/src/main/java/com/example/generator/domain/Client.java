package com.example.generator.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Client {
    
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private long nif;

    private String address;

    
    
}
