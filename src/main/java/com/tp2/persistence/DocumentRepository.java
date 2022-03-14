package com.tp2.persistence;

import com.tp2.model.Document;

import java.text.ParseException;
import java.util.List;

public interface DocumentRepository {
    List<Document> findByTitre( String titre);

    List<Document> findByAuteur(String auteur);

    List<Document> findByAnnee(String anneePublication) throws ParseException;

    List<Document> findByCategorie(String genre);

    Document findDocumentById(long documentId);
}
