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

}
