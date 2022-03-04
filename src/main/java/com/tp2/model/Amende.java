package com.tp2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
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
