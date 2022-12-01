package com.visionarycrofting.visionary__crofting.Controller;


import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Service.impl.CommandServiceImpl;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1")
@RestController
public class CommandController {
    @Autowired
    CommandServiceImpl Commandservice;


    @PostMapping(value = "/commande")
    public Command saveCommand(@RequestBody Command command){
        return  Commandservice.saveCommande(command);
    }

    @GetMapping("/commande")
    public List<Command> findAll() { return Commandservice.findAll();}

    @PutMapping("/commande/{id}")
    public Command updateCommande(@RequestBody Command command,@PathVariable("id") int commandeId)
    { return Commandservice.update(command, commandeId); }

    @DeleteMapping("/commande/{id}")
    public String deleteCommandById(@PathVariable("id") int commandId) {
        Commandservice.delete(commandId);
        return "Deleted Successfully";
    }

    @GetMapping( "/search/{keyword}")
    public List<Command> search( @PathVariable("keyword") String keyword){
        return Commandservice.listAll(keyword);
        /*model.addAttribute("listCommand", listCommand);
        model.addAttribute("keyword", keyword);*/
    }
}
