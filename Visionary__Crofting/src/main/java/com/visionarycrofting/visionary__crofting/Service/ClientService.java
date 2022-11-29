package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Entities.Client;
import com.visionarycrofting.visionary__crofting.Entities.Command;

import java.util.List;

public interface ClientService {
    Client saveClient(Client client);
    List<Client> findAll();
    Client update(Client client);
    void  delete(int id);
}
