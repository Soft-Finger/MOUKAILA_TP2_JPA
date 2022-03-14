package com.tp2.persistence;

import com.tp2.model.Employe;

import java.util.List;

public interface EmployeRepository {

    void save(Employe employe);

    List<Employe> findByName( String name);

    Employe findById(long employeId);
}
