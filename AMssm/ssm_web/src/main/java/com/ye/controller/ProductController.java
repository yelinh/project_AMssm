package com.ye.controller;


import com.ye.domain.Product;
import com.ye.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController{
    @Autowired
    ProductService productService;

    /**
     * 查询全部
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        //准备数据
        List<Product> productLists = productService.findAll();
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("productLists",productLists);
        //指定页面
        modelAndView.setViewName("product-list");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Product product){

       productService.save(product);
       return "redirect:findAll";




    }
}
