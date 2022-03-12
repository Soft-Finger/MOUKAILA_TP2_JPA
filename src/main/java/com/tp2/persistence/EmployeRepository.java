package com.tp2.persistence;

import com.tp2.model.Amende;

import java.util.Date;

public interface EmployeRepository {

    <T> void save(T t);
    void saveClientEmprunteur ( Date datePret, Date dateRetour, Date dateRetourEffectif, long clientId);
    long createClientEmprunteur(Date datePret, Date dateRetour, Date dateRetourEffectif);
}
