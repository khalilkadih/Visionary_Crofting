package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Entities.Product;

public interface ProductService {
    Product saveProduct(Product product);
    int deleteProduct(int i);
    Product updateProduct(Product product);
    Product findProduct(int i);

}
