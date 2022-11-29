package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Entities.Client;
import com.visionarycrofting.visionary__crofting.Entities.Command;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client saveClient(Client client);
    Client findByEmail(String email);
    Boolean existsByEmail(String email);
    List<Client> findAll();
    Client update(Client client);
    void  delete(int id);

}
