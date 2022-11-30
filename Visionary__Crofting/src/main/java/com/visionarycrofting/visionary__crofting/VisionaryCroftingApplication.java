package com.visionarycrofting.visionary__crofting;

import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Service.impl.ClientServiceImpl;
import com.visionarycrofting.visionary__crofting.Service.impl.CommandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

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

   /* public void run(String... args) throws Exception {
        Command c = new Command();

        System.out.println("===============================================hello");
        String Keyword = "RRRR";
        List<Command> commands = cs.listAll(Keyword);
        commands.forEach((p) -> {
            System.out.println(p.getReference());
        });

        c.setReference("hhhh");
        c.setCommandDate("2323232");
        c.setCommandTotalPrice(123.5);
        cs.saveCommande(c);
    }*/



}