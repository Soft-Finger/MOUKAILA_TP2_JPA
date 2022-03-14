package com.tp2.persistence;

import com.tp2.model.Client;

public interface ClientRepository {
    void saveClient( Client client);
    Client findClientById(long clientId);
}
