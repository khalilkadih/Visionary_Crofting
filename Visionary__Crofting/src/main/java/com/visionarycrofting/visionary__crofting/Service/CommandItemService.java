package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Entities.CommandItem;

import java.util.List;

public interface CommandItemService {

    CommandItem saveCommandItem(CommandItem commandItem);
    List<CommandItem> findAllItem();
    CommandItem updateItem(CommandItem commandItem , int id);
    void  delete(int id);
}
