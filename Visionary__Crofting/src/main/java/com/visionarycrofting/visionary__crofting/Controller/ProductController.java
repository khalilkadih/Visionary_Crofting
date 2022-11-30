package com.visionarycrofting.visionary__crofting.Controller;

import com.visionarycrofting.visionary__crofting.Entities.Product;
import com.visionarycrofting.visionary__crofting.Service.impl.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductServiceImp productServiceImp;

    @GetMapping("/allProducts")
    public List<Product> productList(){
        return productServiceImp.productList();
    }
    @GetMapping("/productByID/{id}")
    public Product getProductByID(@PathVariable(value = "id") Long id){
         return productServiceImp.getProductByID(id);
    }
    @PostMapping("/add")
    public void saveProduct(@RequestBody Product product){
        System.out.println("hello from controller"+ product.toString());
         productServiceImp.saveProduct(product);
    }

    @PutMapping("/updateProduct")
    public void updateProduct( @RequestBody Product product){
        productServiceImp.update(product);
    }
    @DeleteMapping("/deleteByID/{id}")
    public String deleteProduct(@PathVariable(name = "id") Long id){
        productServiceImp.deleteProduct(id);
        return "product deleted Successfully";
    }
  /*  @DeleteMapping("/deleteProduct")
    public Product deleteProduct(Product product){

    }*/

}
