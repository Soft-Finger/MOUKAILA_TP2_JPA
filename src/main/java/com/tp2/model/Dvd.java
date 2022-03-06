package com.tp2.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dvd extends Document{

    private int duree;
}
