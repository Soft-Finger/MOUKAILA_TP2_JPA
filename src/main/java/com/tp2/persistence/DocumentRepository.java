package com.tp2.persistence;

import com.tp2.model.Cd;
import com.tp2.model.Document;
import com.tp2.model.Dvd;
import com.tp2.model.Livre;

import java.util.List;

public interface DocumentRepository {
    List<Document> findByTitre( String titre);

    List<Document> findByAuteur(String auteur);

    List<Document> findByAnnee(String anneePub);

    List<Document> findByCategorie(String genre);

    Document findDocumentById(long documentId);
}
