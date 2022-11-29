package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Entities.Command;

import java.util.List;

public interface CommandService {
    Command saveCommande(Command command);
    List<Command> findAll();
    Command update(Command command,int commandeId);
    void  delete(int id);
}
