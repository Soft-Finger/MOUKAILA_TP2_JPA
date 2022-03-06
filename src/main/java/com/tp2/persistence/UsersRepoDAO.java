package com.tp2.persistence;

import com.tp2.model.*;
import javax.persistence.*;
import java.util.List;


public class UsersRepoDAO implements UsersRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliothequeTp2");

    public void saveClient ( Client client ) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(client);

        em.getTransaction().commit();
        em.close();
    }

    public void saveEmploye ( Employe employe ) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(employe);

        em.getTransaction().commit();
        em.close();

    }

    public void saveAdmin ( Admin admin ) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(admin);

        em.getTransaction().commit();
        em.close();

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
