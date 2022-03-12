package com.tp2.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true, includeFieldNames = true)
public class Client extends Users {

    private String adresse;

    @OneToMany(targetEntity = Amende.class, mappedBy = "client")
    private List<Amende> amendes;

    @OneToMany(targetEntity = PretDocument.class, mappedBy = "client")
    private List<PretDocument> pretDocuments;


    /*@OneToMany(mappedBy = "client")
    private List<Exemplaire> exemplaires;*/
}