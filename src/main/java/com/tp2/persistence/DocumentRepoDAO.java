package com.tp2.persistence;

import com.tp2.model.Document;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

import static com.tp2.Manager.emf;

public class DocumentRepoDAO implements DocumentRepository {
    //Rechercher un document par titre
    @Override
    public List<Document> findByTitre( String titre) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Document> query = em.createQuery("select d from Document d where d.titre like :nameToSearch", Document.class);
        query.setParameter("nameToSearch", "%" + titre + "%");
        final List<Document> documents = query.getResultList();

        em.getTransaction().commit();
        em.close();

        return documents;
    }

    //Recherche par auteur
    @Override
    public List<Document> findByAuteur(String aut) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Document> query = em.createQuery("select d from Document d where d.auteur= :nameToSearch", Document.class);
        query.setParameter("nameToSearch", aut);
        final List<Document> documents = query.getResultList();

        em.getTransaction().commit();
        em.close();

        return documents;

    }

    @Override
    public List<Document> findByAnnee(String anneePub) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Document> query = em.createQuery("select d from Document d where YEAR(d.datePub)= :year1", Document.class);
        query.setParameter("year1", Integer.parseInt(anneePub));
        // query.setParameter("year2",simpleDateFormat.parse(anneePub+"-12-31"));

        final List<Document> documents = query.getResultList();

        em.getTransaction().commit();
        em.close();

        return documents;

    }

    //Recherche par categorie
    @Override
    public List<Document> findByCategorie( String genre) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Document> query = em.createQuery("select d from Document d where d.genre= :nameToSearch", Document.class);
        query.setParameter("nameToSearch", genre);
        final List<Document> documents = query.getResultList();

        em.getTransaction().commit();
        em.close();

        return documents;

    }

    @Override
    public Document findDocumentById(long documentId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Document doc = em.find(Document.class, documentId);

        em.getTransaction().commit();
        em.close();

        return doc;
    }
}
