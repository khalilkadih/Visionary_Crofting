package com.visionarycrofting.visionary__crofting.Controller;


import com.visionarycrofting.visionary__crofting.Entities.CommandItem;
import com.visionarycrofting.visionary__crofting.Service.ClientService;
import com.visionarycrofting.visionary__crofting.Service.CommandItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2")
public class CommandItemController {

    @Autowired
     private CommandItemService commandItemService;

    @PostMapping("/Item")
    public CommandItem saveItem(@RequestBody CommandItem commandItem){
        return commandItemService.saveCommandItem(commandItem);
    }

    @GetMapping("/Item")
    public List<CommandItem> findAll(){
        return commandItemService.findAllItem();
    }

    @PutMapping("/Item/{id}")
    public CommandItem UpdateItem(@RequestBody CommandItem commandItem, @PathVariable("id") int ItemId){
        return  commandItemService.updateItem(commandItem,ItemId);
    }

    @DeleteMapping("/Item/{id}")
    public String DeletItem(@PathVariable("id") int itemId){
        commandItemService.delete(itemId);
        return "Deleted Successfully";
    }

}
