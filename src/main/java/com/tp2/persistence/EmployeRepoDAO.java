package com.tp2.persistence;

import com.tp2.model.*;

import javax.persistence.EntityManager;
import java.util.List;

import static com.tp2.Manager.emf;

public class EmployeRepoDAO implements EmployeRepository {

    @Override
    public void save(Employe employe) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(employe);

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Employe> findByName( String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employe findById( long employeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
