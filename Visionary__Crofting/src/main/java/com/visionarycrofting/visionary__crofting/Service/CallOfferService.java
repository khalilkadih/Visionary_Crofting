package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Entities.CallOffer;
import com.visionarycrofting.visionary__crofting.Entities.Product;

import java.util.List;

public interface CallOfferService {
    CallOffer saveCallOffer(CallOffer callOffer);
    void deleteCallOffer(int i);
    CallOffer updateCallOffer(CallOffer callOffer);
    CallOffer findCallOffer(int i);


    List<CallOffer> filterByStatus(int st);
}
