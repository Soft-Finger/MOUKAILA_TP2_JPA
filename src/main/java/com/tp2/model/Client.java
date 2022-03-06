package com.tp2.model;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Entity
@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client extends Users {

    private String adresse;
    private String type;
    private int nbMaxPret;

    @OneToMany(mappedBy = "client")
    private List<PretDocument> pretDocuments;

    @OneToMany(mappedBy = "client")
    private List<Amende> amendes;

    @OneToMany(mappedBy = "client")
    private List<Exemplaire> exemplaires;
}
