package com.tp2.model;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String adresse;
    private String type;
    private int nbMaxPret;

    @OneToMany(mappedBy = "client")
    private List<PretDocument> exemplaires;

    @OneToMany(mappedBy = "client")
    private List<Amende> amendes;
}
