package com.visionarycrofting.visionary__crofting.Controller;


import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Service.CommandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1")
@RestController
public class CommandController {
    @Autowired
    CommandServiceImpl Commandservice;

    @GetMapping("/commande")
    public List<Command> findAllCommand(){
       return Commandservice.findAll();
    }
    @PostMapping("/commande")
    public Command saveCommand(@RequestBody Command command){
        return  Commandservice.saveCommande(command);
    }
    @DeleteMapping ("/delete/{id}")
    public void deleteCommand(@PathVariable("id") int id ){
        Commandservice.delete(id);
    }
}
