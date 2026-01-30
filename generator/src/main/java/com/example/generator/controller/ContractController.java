package com.example.generator.controller;

/*
this file should only verify if the requests are well-formatted and return the response to the request */
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.generator.DTO.ContractRequestDTO;
import com.example.generator.DTO.ContractResponseDTO;
import com.example.generator.service.ContractService;

// todo
@RestController
@RequestMapping("/contracts")
public class ContractController {

    private ContractService contractService;

    
    @PostMapping
    public ResponseEntity<ContractResponseDTO> createContract(ContractRequestDTO request) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<ContractResponseDTO> removeContract(ContractRequestDTO request) {
        return null;
    }

    @PutMapping
    public ResponseEntity<ContractResponseDTO> editContract(long id, ContractRequestDTO request) {
        return null;
    }

    @PatchMapping
    public ResponseEntity<ContractResponseDTO> patchContract(long id, ContractRequestDTO request) {
        return null;
    }

    @GetMapping("/my")
    public ResponseEntity<ContractResponseDTO> listContracts(long id, ContractRequestDTO request) {
        return null;
    }

}
