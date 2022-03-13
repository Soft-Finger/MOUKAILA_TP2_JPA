package com.tp2.persistence;

import com.tp2.model.Client;

import javax.persistence.EntityManager;

import static com.tp2.Manager.emf;

public class ClientRepoDAO implements ClientRepository {

    @Override
    public void saveClient( Client client) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(client);

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Client findClientById( long clientId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Client client = em.find(Client.class, clientId);

        em.getTransaction().commit();
        em.close();

        return client;
    }
}
