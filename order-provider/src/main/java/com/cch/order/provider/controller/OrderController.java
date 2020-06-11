package com.cch.order.provider.controller;

import com.cch.order.provider.beans.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 2020-06-11 17:04:24
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(value = "/listOrders",method = RequestMethod.GET)
    public List<Order> listOrders(){
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("100001","笔记本订单"));
        orderList.add(new Order("100002","手机订单"));
        orderList.add(new Order("100003","内存条订单"));
        return orderList;
    }
}
