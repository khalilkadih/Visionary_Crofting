package com.visionarycrofting.visionary__crofting;

import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Service.impl.CommandServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VisionaryCroftingApplicationTests {

    @Autowired
    CommandServiceImpl cs ;
    @Test
    void CommandAdd() {

        Command c = new Command();
        c.setReference("HHH");
        c.setCommandDate("1999-22-44");
        c.setCommandTotalPrice(123.0);
        cs.saveCommande(c);
        List<Command> commandelist = cs.findAll();

        Command lastcheck = commandelist.get(commandelist.size() - 1);
        assertEquals(c.getReference(),lastcheck.getReference());
    }
    //@Test
    //void findAll(){
        //List<Command> commands=cs.findAll();
        //commands.forEach((c)->{
            //System.out.println(c.getCommandDate());
        //});
    //}
}
