package com.visionarycrofting.visionary__crofting;

import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Service.impl.ClientServiceImpl;
import com.visionarycrofting.visionary__crofting.Service.impl.CommandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class VisionaryCroftingApplication  {
    @Autowired
    private CommandServiceImpl cs ;

    @Autowired
    private ClientServiceImpl clientService;

    public static void main(String[] args) {
        SpringApplication.run(VisionaryCroftingApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Command c = new Command();
        //c.setReference("HHH");
        //c.setCommandDate("1999-22-44");
        //c.setCommandTotalPrice(123.0);
        //cs.saveCommande(c);
    }



}