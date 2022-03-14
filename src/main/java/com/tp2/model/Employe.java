package com.tp2.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)

public class Employe extends Users {
    private String adresse;
}
