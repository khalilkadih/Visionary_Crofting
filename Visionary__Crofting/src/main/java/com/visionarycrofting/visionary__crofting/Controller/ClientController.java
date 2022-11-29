package com.visionarycrofting.visionary__crofting.Controller;

import com.visionarycrofting.visionary__crofting.Service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v2")
@RestController
public class ClientController {
    @Autowired
    ClientServiceImpl clientService;

}
