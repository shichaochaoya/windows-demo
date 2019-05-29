package com.wang.clouddemo.demo.service;


import com.wang.clouddemo.demo.pojo.Order;
import com.wang.clouddemo.demo.repository.OrderRepository;
import com.wang.clouddemo.demo.repository.ProductRepository;
import com.wang.clouddemo.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }
    public Order findByOid(Integer oid){
        return orderRepository.findByOid(oid);
    }
    public List<Order> findByUid(Integer uid){
        return orderRepository.findAllByUid(uid);
    }
    public List<Order> findByPid(Integer pid){
        return orderRepository.findAllByPid(pid);
    }
    /*public List<Order> findByDate(Date date){
        return orderRepository.findAllByDate(date);
    }*/


    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
    public String deleteByOid(Integer oid){
        orderRepository.deleteByOid(oid);
        return "delete success";
    }
    public String updateOrder(Order order){
        orderRepository.save(order);
        return "update : "+order.getOid()+"success";
    }

}
