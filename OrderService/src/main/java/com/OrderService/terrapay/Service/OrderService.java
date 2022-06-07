package com.OrderService.terrapay.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderService.terrapay.Entity.Order;
import com.OrderService.terrapay.Repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repo;
	
	public Order orderservice(Order order) {
		return repo.save(order);
	}
	
	public Order saveOrderDetails(Order order) {
		
		return null;
	}

	public Optional<Order> getOrderById(Integer orderid) {
		
		return repo.findById(orderid);
	}

	public Optional<Order> getOrderByPinCode(Integer pincode) {
	
		return repo.findById(pincode);
	}
}
