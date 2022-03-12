package com.tp2.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PretDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPretDoc;

    private Date datePret;
    private Date dateRetour;
    private Date dateRetourEffectif;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "idDoc")
    private Document document;

}

