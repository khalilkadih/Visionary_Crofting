package com.visionarycrofting.visionary__crofting.Dao;

import com.visionarycrofting.visionary__crofting.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Long> {
    public List<Product> findProductByStockIdOrderByQuantity(Integer stockid);
    public List<Product> findProductByStockIdOrderByProductPrice(Integer stockid);

}
