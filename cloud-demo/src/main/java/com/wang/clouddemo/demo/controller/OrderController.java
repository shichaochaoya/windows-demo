package com.wang.clouddemo.demo.controller;


import com.wang.clouddemo.demo.pojo.Order;
import com.wang.clouddemo.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public @ResponseBody
    List<Order> getAllOrder(){
        return orderService.getOrders();
    }

    @GetMapping("/order/oid/{oid}")
    Order getOrderByOid(@PathVariable Integer oid){
        return orderService.findByOid(oid);
    }

    @GetMapping("/order/uid/{uid}")
    List<Order> getOrderByUid(@PathVariable Integer uid){
        return orderService.findByUid(uid);
    }

    @GetMapping("/order/pid/{pid}")
    List<Order> getOrderByPid(@PathVariable Integer pid){
        return orderService.findByPid(pid);
    }


    @PutMapping("order/save")
    public Order orderAdd(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @DeleteMapping("order/oid/{oid}")
    public String deleteByOid(@PathVariable Integer oid){
        return orderService.deleteByOid(oid);
    }

    @PutMapping("order/update")
    public String update(@RequestBody Order order){
        return orderService.updateOrder(order);
    }
}
