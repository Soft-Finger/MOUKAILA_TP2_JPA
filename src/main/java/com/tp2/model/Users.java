package com.tp2.model;


import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idUser;

    private String nom;
    private String prenom;
}