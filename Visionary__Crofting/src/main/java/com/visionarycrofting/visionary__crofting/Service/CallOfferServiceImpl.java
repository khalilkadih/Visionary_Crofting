package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Dao.CallOfferRepository;
import com.visionarycrofting.visionary__crofting.Entities.CallOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Optional;

@Service
public class CallOfferServiceImpl implements CallOfferService{
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
