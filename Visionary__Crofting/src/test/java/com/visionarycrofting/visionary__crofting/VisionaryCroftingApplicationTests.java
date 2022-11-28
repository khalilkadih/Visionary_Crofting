package com.visionarycrofting.visionary__crofting;

import com.visionarycrofting.visionary__crofting.Entities.Command;
import com.visionarycrofting.visionary__crofting.Service.commandServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VisionaryCroftingApplicationTests {

    @Autowired
    commandServiceImpl cs ;
    @Test
    void CommandAdd() {
        Command c = new Command();
        c.setReference("HHH");
        c.setCommandDate("1999-22-44");
        c.setCommandTotalPrice(123.0);
        cs.saveCommande(c);
    }

}
