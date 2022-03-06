package com.tp2.service;

import com.tp2.model.Amende;
import com.tp2.model.Client;
import com.tp2.model.Exemplaire;
import com.tp2.model.PretDocument;
import com.tp2.persistence.AdminRepository;
import com.tp2.persistence.ClientRepository;
import com.tp2.persistence.EmployeRepository;

import java.util.List;

public class AdminService {
    private ClientRepository clientRepository;
    private AdminRepository adminRepository;
    private EmployeRepository employeRepository;

    public AdminService ( ClientRepository clientRepository , AdminRepository adminRepository , EmployeRepository employeRepository ) {
        this.clientRepository = clientRepository;
        this.adminRepository = adminRepository;
        this.employeRepository = employeRepository;
    }

    public void createClient ( String nom,
                               String prenom,
                               String adresse,
                               List<Amende> amendeList,
                               List<Exemplaire> exemplaireList,
                               List<PretDocument> pretDocumentList,
                               String type,
                               int nbMaxPrets ) {
        Client client = Client.builder()
                .adresse( adresse )
                .amendes(amendeList  )
                .exemplaires( exemplaireList )
                .nbMaxPret( nbMaxPrets )
                .pretDocuments( pretDocumentList )
                .type(type  )
                .build();
        clientRepository.saveClient( client );
    }
}
