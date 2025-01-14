package com.cloud.order.controller;

import com.cloud.order.pojo.Order;
import com.cloud.order.service.OrderServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderServer orderServer;

    @GetMapping("/{id}")
    public Order find(@PathVariable Integer id){
        return orderServer.fndById(id);
    }
}
