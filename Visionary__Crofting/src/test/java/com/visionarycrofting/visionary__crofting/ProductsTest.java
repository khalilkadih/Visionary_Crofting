package com.visionarycrofting.visionary__crofting;

import com.visionarycrofting.visionary__crofting.Entities.Product;
import com.visionarycrofting.visionary__crofting.Exception.EmptyProductException;
import com.visionarycrofting.visionary__crofting.Service.productService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductsTest {
    @Autowired
    productService productService;
    @Test
    public void productShouldBeSavedSuccessfully(){
        Product product = new Product();
        product.setProductName("product1");
        product.setProductPrice(12.00);
        product.setCategory("cat1");
        product.setDescription("description");
        product.setQuantity(10);
        Product product1 = productService.saveProduct(product);
        Assertions.assertNotNull(product1);
        Assertions.assertEquals(product1,product);
    }
    @Test
    public void emptyProductShouldReturnProductException(){
        Exception exception = Assertions.assertThrows(EmptyProductException.class,()->{
            Product product=new Product();
            Product product1 = productService.saveProduct(product);
        });
    }
    @Test
    public void productShouldBeUpdatedSuccessfully(){
        Product product = new Product();
        product.setProductName("product1");
        product.setProductPrice(12.00);
        product.setCategory("cat1");
        product.setDescription("description");
        product.setQuantity(10);
        Product product1 = productService.saveProduct(product);
        Product product11 = productService.findProduct(product1.getId());
        product11.setQuantity(900);
        Product product2 = productService.updateProduct(product);
        Assertions.assertNotNull(product2);
        Assertions.assertEquals(product2,product11);
    }
    @Test
    public void productShouldBeDeletedSuccessfully(){
        Product product = new Product();
        product.setProductName("product1");
        product.setProductPrice(12.00);
        product.setCategory("cat1");
        product.setDescription("description");
        product.setQuantity(10);
        Product savedProduct = productService.saveProduct(product);
        int id = savedProduct.getId();
        productService.deleteProduct(id);
        Product searchedProduct = productService.findProduct(id);
        Assertions.assertNull(savedProduct);
    }


}