package com.visionarycrofting.visionary__crofting.Dao;

import com.visionarycrofting.visionary__crofting.Entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<Product,Long>{
}
