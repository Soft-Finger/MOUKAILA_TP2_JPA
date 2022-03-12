package com.tp2.service;

import com.tp2.model.Amende;
import com.tp2.persistence.AmendeRepository;
import com.tp2.persistence.EmployeRepository;

import java.util.Date;

public class EmployeService {
    private EmployeRepository employeRepository;

    public EmployeService ( EmployeRepository employeRepository ) {
        this.employeRepository = employeRepository;
    }

    public long createEmployeEmprunteur( Date datePret, Date dateRetour, Date dateRetourEffectif) {
        return employeRepository.createClientEmprunteur( datePret, dateRetour, dateRetourEffectif );
    }
}
