package com.tp2.persistence;

import com.tp2.model.Cd;
import com.tp2.model.Dvd;
import com.tp2.model.Livre;

public interface DocumentRepository {
    void save( Cd cd);
    void save( Dvd dvd );
    void save( Livre livre );
}
