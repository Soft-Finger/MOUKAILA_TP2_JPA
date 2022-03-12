package com.tp2.persistence;

import com.tp2.model.Amende;
import com.tp2.model.Client;
import com.tp2.model.Exemplaire;
import com.tp2.model.PretDocument;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class EmployeRepoDAO implements EmployeRepository {

    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "bibliothequeTp2" );


    public <T> void save ( T t ) {
        final EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        em.persist(t);

        em.getTransaction().commit();
        em.close();
    }

    public void saveClientEmprunteur ( Date datePret , Date dateRetour , Date dateRetourEffectif , long clientId ) {

    }

    public long createClientEmprunteur ( Date datePret , Date dateRetour , Date dateRetourEffectif ) {
        return 0;
    }

    public void saveClientEmprunteur ( Date datePret , Date dateRetour , Date dateRetourEffectif ) {

    }

    public PretDocument createClientEmprunteur ( Date datePret , Date dateRetour , Date dateRetourEffectif, Client client, Exemplaire exemplaire ) {
        final PretDocument pretDocument = new PretDocument(datePret, dateRetour, dateRetourEffectif, client, exemplaire);
        save( pretDocument );
        return pretDocument;
    }
}
