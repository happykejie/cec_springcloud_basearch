package com.example.springbootdemoconsumer.controller;


import com.example.springbootdemoconsumer.service.ProductService;
import com.example.springbootdemoentity.entity.Consumer;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
    * @Title: ConsumerController
    * @ProjectName springbootdemo
    * @Description: TODO
    * @author YangPeng
    * @date 2019/3/27-11:32
*/
@RestController
public class ConsumerController {
    @Autowired
    private ProductService productService;



    @Autowired
    @Value("${name}")
    private String name;

    @RequestMapping(value = "getConsumer")
    public String getConsumer(){
       String str =  productService.getProduct();
        Consumer consumer = new Consumer();
        System.out.println(consumer.toString());
//        System.out.println(consumer.getAdd());
//        System.out.println(consumer.getAge());
//        consumer.setAge(12333);
//        System.out.println(consumer.getAge());
        System.out.println(name);
       return str;
    }
}
