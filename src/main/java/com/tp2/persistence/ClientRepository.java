package com.tp2.persistence;

import com.tp2.model.Client;

public interface ClientRepository {
    void createClient();
    void saveClient( Client client );
}
