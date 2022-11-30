package com.visionarycrofting.visionary__crofting.Service.impl;

import com.visionarycrofting.visionary__crofting.Dao.CommandItemRepository;
import com.visionarycrofting.visionary__crofting.Entities.CommandItem;
import com.visionarycrofting.visionary__crofting.Service.CommandItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CommandItemServiceImpl implements CommandItemService {

    CommandItem commandItem = new CommandItem();
    @Autowired
    private CommandItemRepository cIR;

    @Override
    public CommandItem saveCommandItem(CommandItem commandItem) {
        return  cIR.save(commandItem);
    }

    @Override
    public List<CommandItem> findAllItem() { return cIR.findAll(); }

    @Override
    public CommandItem updateItem(CommandItem commandItem, int id) {
        CommandItem existingItem=cIR.findById(id).get();
        if (Objects.nonNull(commandItem.getReferenceOfItem()) && !"".equalsIgnoreCase(commandItem.getReferenceOfItem())) {
            existingItem.setReferenceOfItem(commandItem.getReferenceOfItem());
        }

        if (Objects.nonNull(commandItem.getItemQuantity())) {
            existingItem.setItemQuantity(commandItem.getItemQuantity());
        }

        if (Objects.nonNull(commandItem.getItemUnitPrice())) {
            existingItem.setItemUnitPrice(commandItem.getItemUnitPrice());
        }

        return cIR.save(existingItem);
    }

    @Override
    public void delete(int id) {
       cIR.deleteById(id);

    }
}
