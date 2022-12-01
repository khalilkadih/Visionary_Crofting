package com.visionarycrofting.visionary__crofting.Service.impl;

import com.visionarycrofting.visionary__crofting.Dao.ClientRepository;
import com.visionarycrofting.visionary__crofting.Dao.VendorRepository;
import com.visionarycrofting.visionary__crofting.Entities.Client;
import com.visionarycrofting.visionary__crofting.Entities.Vendor;
import com.visionarycrofting.visionary__crofting.Service.ClientService;
import com.visionarycrofting.visionary__crofting.Service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
    public Client findByEmail(String email) {
        Client client = clientRepository.findByEmail(email);
        return client;
    }

    @Override
    public Boolean existsByEmail(String email) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client update(Client client, int clientId) {
    Client existingClient=clientRepository.findById(clientId).get();
    if (Objects.nonNull(client.getEmail()) && !"".equalsIgnoreCase(client.getEmail())) {
        existingClient.setEmail(client.getEmail());
    }

    if (Objects.nonNull(client.getPhone()) && !"".equalsIgnoreCase(client.getPhone())) {
        existingClient.setPhone(client.getPhone());
    }

    if (Objects.nonNull(client.getPassword())) {
        existingClient.setPassword(client.getPassword());
    }

    return clientRepository.save(existingClient);

}

    @Override
    public void delete(int id) {
    clientRepository.deleteById(id);
    }




    @Service
    public static class VendorServiceImpl implements VendorService {
        @Autowired
        public VendorRepository vendorRepository;
        @Override
        public Vendor saveVendor(@Valid Vendor vendor) {
            return vendorRepository.save(vendor);
        }

        @Override
        public int deleteVendor(int i) {
            if(i<1) return -1;
            vendorRepository.deleteById(i);
            return i;
        }

        @Override
        public Vendor updateVendor(@Valid Vendor vendor) {
            return vendorRepository.save(vendor);
        }

        @Override
        public Vendor findVendor(int i) {
            Optional<Vendor> vendor= vendorRepository.findById(i);
            Vendor vendorFounded = vendor.get();
            return vendorFounded;
        }
        @Override
        public List<Vendor> findAllVendors(){
            return vendorRepository.findAll();
        }

    }
}
