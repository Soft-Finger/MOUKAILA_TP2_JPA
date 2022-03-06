package com.tp2.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExemplaireRepoDAO<T> implements ExemplaireRepository <T> {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "bibliothequeTp2" );

    public void createExemplaire ( T t ) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist( t );
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }
}
