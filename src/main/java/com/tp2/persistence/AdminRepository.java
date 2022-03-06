package com.tp2.persistence;

import com.tp2.model.Admin;
import com.tp2.model.Client;
import com.tp2.model.Employe;

import java.util.List;

public interface AdminRepository {
    void saveClient ( Client client);
    void saveEmploye ( Employe employe );
    void saveAdmin ( Admin admin );

    List<Client> findClientByName( String name);
    List<Employe> findEmployeByName( String name);
    List<Admin> findAdminByName( String name);

    Client findClientById(long passengerId);
    Employe findEmployeById(long passengerId);
    Admin findAdminById ( long passengerId);

}
