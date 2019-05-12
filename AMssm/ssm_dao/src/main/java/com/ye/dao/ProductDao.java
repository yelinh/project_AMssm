package com.ye.dao;

import com.ye.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


import java.util.List;

public interface ProductDao {
    @Select("select * from product")
    List<Product> findAll();

    @Insert("insert into product values( null,#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc} ,#{productStatus} )")
    void save(Product product);
}
