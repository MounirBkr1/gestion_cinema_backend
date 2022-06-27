package com.mnr.gestion_cinema_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nomClient;
    private double prix;

    @Column(unique=true)
    private int codePayement;
    private boolean reservee;

    @ManyToOne
    private Place place;

    @ManyToOne
    private Projection projection;
    
}
