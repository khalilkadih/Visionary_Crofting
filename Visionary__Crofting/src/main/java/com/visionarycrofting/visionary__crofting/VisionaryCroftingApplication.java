package com.visionarycrofting.visionary__crofting;

import com.visionarycrofting.visionary__crofting.Dao.ClientRepository;
import com.visionarycrofting.visionary__crofting.Dao.CommandRepository;
import com.visionarycrofting.visionary__crofting.Entities.Client;
import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Entities.CommandItem;
import com.visionarycrofting.visionary__crofting.Service.ClientServiceImpl;
import com.visionarycrofting.visionary__crofting.Service.CommandServiceImpl;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class VisionaryCroftingApplication implements CommandLineRunner {
    @Autowired
    private CommandServiceImpl cs ;

    @Autowired
    private ClientServiceImpl clientService;

    public static void main(String[] args) {
        SpringApplication.run(VisionaryCroftingApplication.class, args);
    }

    public void run(String... args) throws Exception {


    }
}