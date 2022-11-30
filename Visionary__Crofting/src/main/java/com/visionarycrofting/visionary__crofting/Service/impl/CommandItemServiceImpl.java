package com.visionarycrofting.visionary__crofting.Service.impl;

import com.visionarycrofting.visionary__crofting.Dao.CommandItemRepository;
import com.visionarycrofting.visionary__crofting.Entities.CommandItem;
import com.visionarycrofting.visionary__crofting.Service.CommandItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommandItemServiceImpl implements CommandItemService {

    //CommandItem commandItem = new CommandItem();
    @Autowired
    private CommandItemRepository cIR;

    @Override
    public CommandItem saveCommandItem(CommandItem commandItem) {
        return  cIR.save(commandItem);
    }

    @Override
    public List<CommandItem> findAllItem() {
        return null;
    }

    @Override
    public CommandItem updateItem(CommandItem commandItem, int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
