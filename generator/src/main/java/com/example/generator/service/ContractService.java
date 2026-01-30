package com.example.generator.service;
/*
this file should be the one responsible for verifying if 
 - the requests are valid
 - they can be processed
 - write the response
 - send to the controller  */

import org.springframework.http.ResponseEntity;

import com.example.generator.DTO.ContractResponseDTO;
import com.example.generator.domain.Contract;
import com.example.generator.repository.ContractRepository;

//todo
public class ContractService {

    private ContractRepository contractRepository;
    
    public ResponseEntity<ContractResponseDTO> postContract(Contract contract){
        return null;
    }

    public ResponseEntity<ContractResponseDTO> deleteContract(Contract contract){
        return null;
    }

    public ResponseEntity<ContractResponseDTO> getContracts(Contract constract){
        return null;
    }

    public ResponseEntity<ContractResponseDTO> getContract(Contract constract){
        return null;
    }

    public ResponseEntity<ContractResponseDTO> putContracts(Contract constract){
        return null;
    }
}
