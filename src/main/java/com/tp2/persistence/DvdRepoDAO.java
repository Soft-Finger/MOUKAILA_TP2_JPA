package com.tp2.persistence;

import com.tp2.model.Dvd;

import javax.persistence.EntityManager;

import static com.tp2.Manager.emf;

public class DvdRepoDAO implements DvdRepository {
    @Override
    public void saveDvd( Dvd dvd) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(dvd);

        em.getTransaction().commit();
        em.close();
    }
}
