package com.tp2.persistence;

import com.tp2.model.Client;
import com.tp2.model.Document;
import com.tp2.model.PretDocument;

import javax.persistence.EntityManager;

import static com.tp2.Manager.emf;

public class PretDocumentRepoDAO implements PretDocumentRepository {

    public boolean disponibiliteDoc( Document doc) {
        EntityManager em = emf.createEntityManager();
        boolean test;
        em.getTransaction().begin();

        Document d = em.find( Document.class , doc.getIdDoc() );
        test = d.isDisponible();
        em.getTransaction().commit();
        em.close();
        return test;
    }

    @Override
    public void savePret ( PretDocument pretDoc ) {



    }

    @Override
    public void findAllPretDocument ( Client client ) {

    }
}
