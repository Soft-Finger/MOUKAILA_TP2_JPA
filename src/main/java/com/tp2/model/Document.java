package com.tp2.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idDoc;

    private String titre;
    private String auteur;
    private String editeur;
    private Date datePub;
    private String genre;
    private boolean disponible;
    private int dureeMaxPret;

}