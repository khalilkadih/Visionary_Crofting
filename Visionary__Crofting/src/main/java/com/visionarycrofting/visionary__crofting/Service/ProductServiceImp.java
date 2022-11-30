package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Dao.ProductDao;
import com.visionarycrofting.visionary__crofting.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp {
    @Autowired
    private ProductDao productDao;
    public List<Product> productList(){
        return (List<Product>) productDao.findAll();
    }

    public Product getProductByID(Long id){
        return productDao.findById(id).get();
    }

    public void saveProduct(Product product){
        productDao.save(product);

    }

    public void deleteProduct(Long id){
        productDao.deleteById(id);
    }
    public void update(Product product){
        productDao.save(product);
    }
    public List<Product> filterProduct(Integer id,String property){
        return property.equals("quantity") ? productDao.findProductByStockIdOrderByQuantity(id): property.equals("price") ? productDao.findProductByStockIdOrderByProductPrice(id): null;
    }

}

