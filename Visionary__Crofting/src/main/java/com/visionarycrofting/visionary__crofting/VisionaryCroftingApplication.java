package com.visionarycrofting.visionary__crofting;

import com.visionarycrofting.visionary__crofting.Entities.*;
import com.visionarycrofting.visionary__crofting.Service.ProductServiceImp;
import com.visionarycrofting.visionary__crofting.Service.impl.CommandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class VisionaryCroftingApplication implements CommandLineRunner {
/*    @Autowired
    private CommandServiceImpl cs ;
    @Autowired
    private ProductServiceImp productServiceImp;*/
    //commandServiceImpl cs = new commandServiceImpl();
    public static void main(String[] args) {
        SpringApplication.run(VisionaryCroftingApplication.class, args);
    }

    public void run(String... args) throws Exception {
        //Command c = new Command();
        //c.setReference("HHH");
        //c.setCommandDate("1999-22-44");
        //c.setCommandTotalPrice(123.0);

        //cs.saveCommande(c);

/*        Stock stock = new Stock();

        stock.setEmail("khalil@email.com");
        stock.setPassword("khalil@");
        stock.setFirstName("khalilovic");
        stock.setLastName("elkadih");

        System.out.println("====================");

        Product  product= new Product();
        product.setProductPrice(300.00);
        product.setProductName("lenovo");
        product.setDescription("lenovo I9");
        product.setCategory("Laptop");
        product.setQuantity(39000);
        product.setStock(stock);

        CommandItem commandItem= new CommandItem();
        commandItem.setProduct(product);
        commandItem.setItemQuantity(3000);
        commandItem.setReferenceOfItem("A0123");
        commandItem.setItemUnitPrice(30.88);
        System.out.println("====================");


        CallOffer callOffer = new CallOffer();
        callOffer.setProductName("lenovo");
        callOffer.setRefferenceOffer("A0123");
        callOffer.setStock(stock);
        callOffer.setStatus(Status.ACCEPTED);

        Vendor vendor= new Vendor();
        vendor.setPhone("0666666666");
        vendor.setEmail("hamza@gmail.com");
        vendor.setLastName("hamza");
        vendor.setFirstName("laqraa");
        List<CallOffer> callOffers=new ArrayList<>();
        callOffers.add(callOffer);
        vendor.setCallOffers(callOffers);
        callOffer.setVendor(vendor);

        stock.setCallOffers(callOffers);

        List<CommandItem> commandItems=new ArrayList<>();
        commandItems.add(commandItem);
        product.setReferenceOfProduct(commandItems);


        List<Product>productList= new ArrayList<>();
        productList.add(product);
        stock.setProduct(productList);

        productServiceImp.saveProduct(product);
        System.out.println("Everything is good");*/
/*
        System.out.println("=======================================");
*/
/*
        System.out.println(productServiceImp.productList().size());
*/
 /*       System.out.println(productServiceImp.productList().size());
        List<Product> productList= new ArrayList<>();*/


/*
        productList.stream().forEach(System.out::println);
*/
/*
        productServiceImp.deleteProduct(88L);
*/
        System.out.println("======================================");

    }
}