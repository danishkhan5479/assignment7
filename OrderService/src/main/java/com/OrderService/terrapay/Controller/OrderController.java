package com.OrderService.terrapay.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrderService.terrapay.Entity.Order;
import com.OrderService.terrapay.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderservice;
	@PostMapping("/saveorder")
	public Order saveOrderDetails(Order order) {
		return orderservice.saveOrderDetails(order);
	}
	
       @GetMapping("/getOrderById/(orderId) ")
       public Optional<Order> getOrderById(@PathVariable Integer orderid) {
    	   return orderservice.getOrderById(orderid);
       }
       
       @GetMapping("/getOrderByPincode/(pincode)")
       public Optional<Order> getOrderByPincode(@PathVariable Integer  pincode) {
    	   return orderservice.getOrderByPinCode(pincode);
       }

	}
      
