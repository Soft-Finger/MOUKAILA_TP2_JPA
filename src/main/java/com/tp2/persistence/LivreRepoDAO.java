package com.tp2.persistence;

import com.tp2.model.Livre;

import javax.persistence.EntityManager;

import static com.tp2.Manager.emf;

public class LivreRepoDAO implements LivreRepository {

    @Override
    public void saveLivre( Livre livre) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(livre);

        em.getTransaction().commit();
        em.close();
    }
}
