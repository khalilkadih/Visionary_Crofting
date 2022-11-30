package com.visionarycrofting.visionary__crofting.Controller;

import com.visionarycrofting.visionary__crofting.Entities.CallOffer;
import com.visionarycrofting.visionary__crofting.Service.CallOfferService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CallOffer")
public class CallOfferController {
    @Autowired
    CallOfferService callOfferService;

    @GetMapping("/filterCall/{st}")
    public List<CallOffer> filterCallOfferByStatus(@PathVariable int st){
        return  callOfferService.filterByStatus(st);
    }
}
