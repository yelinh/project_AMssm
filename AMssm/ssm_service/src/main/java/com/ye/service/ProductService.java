package com.ye.service;

import com.ye.domain.Product;


import java.util.List;


public interface ProductService {
    List<Product> findAll();
    void save(Product product);
}


