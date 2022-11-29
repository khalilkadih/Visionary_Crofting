package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Dao.ClientRepository;
import com.visionarycrofting.visionary__crofting.Dao.CommandRepository;
import com.visionarycrofting.visionary__crofting.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {
    Client client=new Client();
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void delete(int id) {

    }
}
