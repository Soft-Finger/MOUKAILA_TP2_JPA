package com.tp2.persistence;

import com.tp2.model.Client;
import com.tp2.model.Document;
import com.tp2.model.PretDocument;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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

    public void miseAJourDisponibiliteDoc(Document doc) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("UPDATE Document d SET d.disponible= :dispo " + "where d.idDoc= :id");
        query.setParameter("dispo", false);
        query.setParameter("id", doc.getIdDoc());
        query.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
    @Override
    public void savePret ( PretDocument pretDoc ) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if (disponibiliteDoc(pretDoc.getDocument())) {
            //enregistrement du pret
            em.persist(pretDoc);

            //Mise à jour de la disponibilité du document
            miseAJourDisponibiliteDoc(pretDoc.getDocument());
        } else {
            System.out.println("le Document "
                    + pretDoc.getDocument().getTitre()
                    + " n'est pas disponible pour un emprunt");
        }
        em.getTransaction().commit();
        em.close();
    }


    @Override
    public void findAllPretDocument ( Client client ) {

    }
}
