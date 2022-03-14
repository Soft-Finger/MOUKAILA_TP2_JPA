package com.tp2.service;

import com.tp2.model.*;
import com.tp2.persistence.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class EmployeService {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private ClientRepository clientRepository;
    private LivreRepository livreRepository;
    private CdRepository cdRepository;
    private DvdRepository dvdRepository;
    private DocumentRepository documentRepository;
    private PretDocumentRepository pretDocumentRepository;

    public EmployeService( ClientRepository clientRepository ,
                           LivreRepository livreRepo ,
                           CdRepository cdRepository ,
                           DvdRepository dvdRepository ,
                           DocumentRepository documentRepository ,
                           PretDocumentRepository pretDocumentRepository ) {
        this.clientRepository = clientRepository;
        this.livreRepository = livreRepo;
        this.cdRepository = cdRepository;
        this.dvdRepository = dvdRepository;
        this.documentRepository = documentRepository;
        this.pretDocumentRepository = pretDocumentRepository;
    }

    public void createClient(String nom, String prenom, String adresse) {
        Client client = Client.builder()
                .nom(nom)
                .prenom(prenom)
                .adresse(adresse)
                .build();
        clientRepository.saveClient(client);
    }

    public void createLivre(String titre,
                            String auteur,
                            String editeur,
                            Date datePub,
                            String genre,
                            boolean disponible,
                            int dureeMaxpret,
                            int nbPages) {
        Livre livre = Livre.builder()
                .titre(titre)
                .auteur(auteur)
                .editeur(editeur)
                .datePub(datePub)
                .genre(genre)
                .disponible(disponible)
                .dureeMaxPret(dureeMaxpret)
                .nbPages(nbPages)
                .build();
        livreRepository.saveLivre(livre);
    }

    public void createCd(String titre,
                         String auteur,
                         String editeur,
                         Date datePub,
                         String genre,
                         boolean disponible,
                         int dureeMaxpret,
                         int duree) {
        Cd cd = Cd.builder()
                .titre(titre)
                .auteur(auteur)
                .editeur(editeur)
                .datePub(datePub)
                .genre(genre)
                .disponible(disponible)
                .dureeMaxPret(dureeMaxpret)
                .duree(duree)
                .build();
        cdRepository.saveCd(cd);
    }

    public void createDvd(String titre,
                          String auteur,
                          String editeur,
                          Date datePub,
                          String genre,
                          boolean disponible,
                          int dureeMaxpret,
                          int duree) {
        Dvd dvd = Dvd.builder()
                .titre(titre)
                .auteur(auteur)
                .editeur(editeur)
                .datePub(datePub)
                .genre(genre)
                .disponible(disponible)
                .dureeMaxPret(dureeMaxpret)
                .duree(duree)
                .build();
        dvdRepository.saveDvd(dvd);
    }

    public List<Document> findByTitre( String titre) {
        return documentRepository.findByTitre(titre);
    }

    public List<Document> findByAuteur(String aut) {
        return documentRepository.findByAuteur(aut);
    }

    public List<Document> findByCategorie(String genre) {

        return documentRepository.findByCategorie(genre);
    }

    public List<Document> findByAnnee(String anneePub) {
        return documentRepository.findByAnnee(anneePub);
    }

    public static Date CalculerDateRetour(int nombreJour) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, nombreJour);

        return simpleDateFormat.parse(simpleDateFormat.format(cal.getTime()));
    }

    public void createPret(Date datePret,
                           Client client,
                           Document document) throws ParseException {
        PretDocument pret = PretDocument.builder()
                .datePret(datePret)
                .dateRetourEffectif(null)
                .dateRetour(CalculerDateRetour(document.getDureeMaxPret()))
                .client(client)
                .document(document)
                .build();
        pretDocumentRepository.savePret(pret);
    }

    public Client findClientById(long clientId) {
        return clientRepository.findClientById(clientId);
    }

    public Document findDocumentById(long documentId) {
        return documentRepository.findDocumentById(documentId);
    }

    public void findAllPretDocument(Client client) {
        pretDocumentRepository.findAllPretDocument(client);
    }

}
