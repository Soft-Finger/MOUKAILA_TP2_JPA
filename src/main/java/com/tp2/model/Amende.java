package com.tp2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class Amende {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAmande;

    private double montant;
    private boolean statut;

    @ManyToOne
    private Client client;
}
