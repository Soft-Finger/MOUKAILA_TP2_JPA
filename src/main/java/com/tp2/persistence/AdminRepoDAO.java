package com.tp2.persistence;

import com.tp2.model.Admin;
import com.tp2.model.Client;
import com.tp2.model.Employe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class AdminRepoDAO implements AdminRepository {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "bibliothequeTp2" );



    public void saveClient ( Client client ) {

            EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist( client );
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }finally {
            entityManager.close();
        }

    }

    public void saveEmploye ( Employe employe ) {

    }

    public void saveAdmin ( Admin admin ) {

    }

    public List<Client> findClientByName ( String name ) {
        return null;
    }

    public List<Employe> findEmployeByName ( String name ) {
        return null;
    }

    public List<Admin> findAdminByName ( String name ) {
        return null;
    }

    public Client findClientById ( long passengerId ) {
        return null;
    }

    public Employe findEmployeById ( long passengerId ) {
        return null;
    }

    public Admin findAdminById ( long passengerId ) {
        return null;
    }
}
