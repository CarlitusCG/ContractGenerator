package com.example.generator.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.generator.domain.Contract;

public interface ContractRepository extends JpaRepository < Contract, UUID>{
    
}
