package com.visionarycrofting.visionary__crofting;

import com.visionarycrofting.visionary__crofting.Dao.CommandRepository;
import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Service.CommandServiceImpl;
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
    private CommandRepository commandRepository;

    public static void main(String[] args) {
        SpringApplication.run(VisionaryCroftingApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Command c = new Command();
        //c.setReference("HHH");
        //c.setCommandDate("1999-22-44");
        //c.setCommandTotalPrice(123.0);
        //cs.saveCommande(c);

<<<<<<< HEAD

=======
        List<Command> commands=cs.findAll();
        commands.forEach((c)->{
        System.out.println(c.getCommandDate());
        });
>>>>>>> cbf86d41550283d68dd6d92bb666baba9224a46f
    }
}