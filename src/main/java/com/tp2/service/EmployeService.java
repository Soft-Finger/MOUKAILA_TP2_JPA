package com.tp2.service;

import com.tp2.model.Amende;
import com.tp2.persistence.AmendeRepository;

public class EmployeService {
    private AmendeRepository amendeRepository;

    public EmployeService ( AmendeRepository amendeRepository ) {
        this.amendeRepository = amendeRepository;
    }

    public Amende createAmende( Double montant, boolean statut) {
        Amende amende = Amende.builder()
                .montant( montant )
                .statut( statut )
                .build();
        amendeRepository.saveAmende( amende );
        return amende;
    }

}
