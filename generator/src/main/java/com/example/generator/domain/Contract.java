package com.example.generator.domain;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table
@Getter
@Setter
public class Contract {

    @Id
    @GeneratedValue
    private UUID id;

    private StatusContrato status;

    @OneToOne
    private User author;

    private Date start;

    private Date expiration;

    @OneToOne
    private Client client;

    private ServiceType type;

}