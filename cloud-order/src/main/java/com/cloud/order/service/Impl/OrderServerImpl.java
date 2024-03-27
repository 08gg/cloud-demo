package com.cloud.order.service.Impl;

import com.cloud.order.mapper.OrderMapper;
import com.cloud.order.pojo.Order;
import com.cloud.order.service.OrderServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pojo.User;

@Service
public class OrderServerImpl implements OrderServer {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Order fndById(Integer id) {
        Order order = orderMapper.find(id);
        String url = "http://userserver/user/" + order.getUserId();
        User user = restTemplate.getForObject(url,User.class);
        order.setUser(user);
        return order;
    }
}
