package com.tp2.service;

import com.tp2.model.*;
import com.tp2.persistence.EmployeRepository;

public class AdminService {
    private EmployeRepository employeRepository;

    public AdminService( EmployeRepository employeRepository ) {
        this.employeRepository = employeRepository;
    }

    public void createEmploye(String nom, String prenom, String adresse) {
        Employe employe = Employe.builder()
                .nom(nom)
                .prenom(prenom)
                .adresse(adresse)
                .build();
        employeRepository.save(employe);
    }
}
