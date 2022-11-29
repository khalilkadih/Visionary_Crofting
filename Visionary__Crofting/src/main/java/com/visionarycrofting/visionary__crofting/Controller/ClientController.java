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
    @PostMapping("/login/{email}/{password}")
    public Client login(@PathVariable String email ,@PathVariable String password){
       Client client= clientService.findByEmail(email);
       if(client.getEmail().equals(email)&& client.getPassword().equals(password)){
           return  client;
       }else{
           return  null;
       }

    }

}
