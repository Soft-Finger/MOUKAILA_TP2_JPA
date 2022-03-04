package com.tp2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long idDocument;

    private String titre;
    private String auteur;
    private String editeur;
    private String genre;
    @OneToMany
    private List<Exemplaire> exemplaires;


    private Date datePublication;
}
