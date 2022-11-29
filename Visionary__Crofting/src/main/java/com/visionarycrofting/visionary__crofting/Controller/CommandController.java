package com.visionarycrofting.visionary__crofting.Controller;


import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Service.impl.CommandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1")
@RestController
public class CommandController {
    @Autowired
    CommandServiceImpl Commandservice;


    @PostMapping("/commande")
    public Command saveCommand(@RequestBody Command command){
        return  Commandservice.saveCommande(command);
    }

    @GetMapping("/salim")
    public List<Command> findAll() { return Commandservice.findAll();}

    @PutMapping("/commande/{id}")
    public Command updateCommande(@RequestBody Command command,@PathVariable("id") int commandeId)
    { return Commandservice.update(command, commandeId); }

    @DeleteMapping("/commande/{id}")
    public String deleteCommandById(@PathVariable("id") int commandId) {
        Commandservice.delete(commandId);
        return "Deleted Successfully";

    }
}
