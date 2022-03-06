package com.tp2.persistence;

import com.tp2.model.Amende;
import org.hibernate.tuple.entity.EntityTuplizerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeRepoDAO implements EmployeRepository {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "bibliothequeTp2" );

    public void saveAmende ( Amende amende ) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist( amende );
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }
}
