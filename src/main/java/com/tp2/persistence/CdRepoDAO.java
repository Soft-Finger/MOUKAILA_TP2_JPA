package com.tp2.persistence;

import com.tp2.model.Cd;
import javax.persistence.EntityManager;
import static com.tp2.Manager.emf;

public class CdRepoDAO implements CdRepository {
    @Override
    public void saveCd( Cd cd) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(cd);

        em.getTransaction().commit();
        em.close();
    }
}
