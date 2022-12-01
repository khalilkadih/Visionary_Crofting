package com.visionarycrofting.visionary__crofting.Service.impl;

import com.visionarycrofting.visionary__crofting.Dao.CallOfferRepository;
import com.visionarycrofting.visionary__crofting.Dao.CommandItemRepository;
import com.visionarycrofting.visionary__crofting.Entities.CallOffer;
import com.visionarycrofting.visionary__crofting.Entities.CommandItem;
import com.visionarycrofting.visionary__crofting.Service.CallOfferService;
import com.visionarycrofting.visionary__crofting.Service.CommandItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    @Service
    public static class CallOfferServiceImpl implements CallOfferService {
        @Autowired
        public CallOfferRepository callOfferRepository;
        @Override
        public CallOffer saveCallOffer(@Valid CallOffer callOffer) {
            return callOfferRepository.save(callOffer);
        }

        @Override
        public void deleteCallOffer(int i) {
             callOfferRepository.deleteById(i);
        }

        @Override
        public CallOffer updateCallOffer(@Valid CallOffer callOffer) {
            return callOfferRepository.save(callOffer);
        }

        @Override
        public CallOffer findCallOffer(int i) {
            Optional<CallOffer> optionalCallOffer = callOfferRepository.findById(i);
            CallOffer callOffer = optionalCallOffer.get();
            return callOffer;
        }
    }
}
