package com.cloud.order.pojo;

import lombok.Data;

@Data
public class Order {
    private int id;
    private String name;
    private int price;
    private int userId;
    private pojo.User user;
}
