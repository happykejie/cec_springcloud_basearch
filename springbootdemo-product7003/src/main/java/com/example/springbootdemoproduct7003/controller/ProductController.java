package com.example.springbootdemoproduct7003.controller;


import com.example.springbootdemoentity.entity.Product;
import com.example.springbootdemoproduct7003.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author YangPeng
 * @Title: ProductController
 * @ProjectName springbootdemo
 * @Description: TODO
 * @date 2019/3/25-19:26
 */
@RestController
public class ProductController {
    @RequestMapping(value = "getProduct")
    public String getProduct() {
     Product product = new Product();
        return product.toString();
    }

    @RequestMapping(value = "/home")
    public String home(){
        System.out.println("123111");
        throw new MyException("101","错误");
    }
}
