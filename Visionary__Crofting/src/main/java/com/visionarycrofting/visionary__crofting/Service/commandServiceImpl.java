package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Dao.CommandRepository;
import com.visionarycrofting.visionary__crofting.Entities.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
;


@Service
public class commandServiceImpl implements  commandService{

    Command command = new Command();
    @Autowired
    private CommandRepository commandRepository;

    @Override
    public Command saveCommande(Command command) {
        String commandeDtae = command.getCommandDate();
        String ref = command.getReference();
        Command com = commandRepository.save(command);
        if(com == null){
            throw  new CommandNotFoundException();
        } else if (commandeDtae.isEmpty() || ref.isEmpty() ) {
            throw  new CommandNotFoundException();
        }
        return com;
    }
}
