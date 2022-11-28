package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Dao.CommandRepository;
import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Exception.CommandNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
;import java.util.List;


@Service
public class CommandServiceImpl implements CommandService {

    Command command = new Command();
    @Autowired
    private CommandRepository commandRepository;

    @Override
    public Command saveCommande(Command command) {
       /* String commandeDtae = command.getCommandDate();
        String ref = command.getReference();*/
        Command com = commandRepository.save(command);
       /* if(com == null){
            throw  new CommandNotFoundException();
        } else if (commandeDtae.isEmpty() || ref.isEmpty() ) {
            throw  new CommandNotFoundException();
        }*/
        return com;
    }


    @Override
    public List<Command> findAll() {
        return commandRepository.findAll();
    }

    @Override
    public Command update(Command command) {
        Command existingCommand=commandRepository.findById(command.getId()).orElse(null);
        existingCommand.setCommandDate(command.getCommandDate());
        existingCommand.setCommandItem(command.getCommandItem());
        existingCommand.setCommandTotalPrice(command.getCommandTotalPrice());
        return commandRepository.save(existingCommand);

    }
    @Override
    public void delete(int id) {
        commandRepository.deleteById(id);
    }
}
