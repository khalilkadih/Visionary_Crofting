package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Dao.CommandRepository;
import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Exception.CommandNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
;import java.util.List;
import java.util.Objects;


@Service
public class CommandServiceImpl implements CommandService {

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

    @Override
    public List<Command> findAll() {
        return commandRepository.findAll();
    }

    @Override
    public Command update(Command command, int commandeId) {
        Command existingCommand=commandRepository.findById(commandeId).get();
        if (Objects.nonNull(command.getCommandDate()) && !"".equalsIgnoreCase(command.getCommandDate())) {
            existingCommand.setCommandDate(command.getCommandDate());
        }

        if (Objects.nonNull(command.getReference()) && !"".equalsIgnoreCase(command.getReference())) {
            existingCommand.setReference(command.getReference());
        }

        if (Objects.nonNull(command.getCommandTotalPrice())) {
            existingCommand.setCommandTotalPrice(command.getCommandTotalPrice());
        }

        return commandRepository.save(existingCommand);

    }
    @Override
    public void delete(int id) {
        commandRepository.deleteById(id);
    }
}
