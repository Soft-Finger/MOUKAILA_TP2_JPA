package com.tp2.persistence;

import com.tp2.model.Client;
import com.tp2.model.PretDocument;

public interface PretDocumentRepository {
    void savePret( PretDocument pretDoc);

    void findAllPretDocument( Client client);
}
