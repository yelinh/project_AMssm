package com.ye.service.impl;


import com.ye.dao.ProductDao;
import com.ye.domain.Product;
import com.ye.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;



    @Override
    public List<Product> findAll() {
        return  productDao.findAll();
    }

    @Override
    public void save(Product product)
    {
        productDao.save(product);

    }
}
