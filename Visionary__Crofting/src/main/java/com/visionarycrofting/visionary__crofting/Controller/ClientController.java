package com.visionarycrofting.visionary__crofting.Controller;

import com.visionarycrofting.visionary__crofting.Entities.Client;
import com.visionarycrofting.visionary__crofting.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/client")

public class ClientController {
    @Autowired
    private ClientService clientService;
    @PostMapping( "/save")
    public Client saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }
    @GetMapping("/red/{email}")
    public Client findByEmail(@PathVariable String email){
        return  clientService.findByEmail(email);
    }
    @PostMapping("/login")
    public Client login(@RequestBody Client client){
       Client client1= clientService.findByEmail(client.getEmail());
       if(client1.getEmail().equals(client.getEmail())&& client1.getPassword().equals(client.getPassword())){
           return  client1;
       }else{
           return  null;
       }
        }
    @DeleteMapping("/client/{id}")
    public String deleteClientById(@PathVariable("id") int id) {
        clientService.delete(id);
        return "Deleted Successfully";
    }
    @PutMapping("/updateClient/{id}")
    public Client updateCommande(@RequestBody Client client,@PathVariable("id") int clientId)
    { return clientService.update(client, clientId); }
    @GetMapping("/Clients")
    public List<Client> findAll() { return clientService.findAll();}
}


