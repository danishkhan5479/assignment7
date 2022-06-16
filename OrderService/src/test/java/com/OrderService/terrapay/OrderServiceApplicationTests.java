package com.OrderService.terrapay;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.OrderService.terrapay.Entity.Address;
import com.OrderService.terrapay.Entity.Order;
import com.OrderService.terrapay.Entity.OrderLine;
import com.OrderService.terrapay.Repository.OrderRepository;
import com.OrderService.terrapay.Service.OrderService;

public class OrderServiceApplicationTests {
	

	List<Order> orderList;
	List<Address> addList;
	List<OrderLine> itemOrderLine;
	Order order;
	@InjectMocks
	OrderService orderService;

	@Mock
	OrderRepository repository;

	@Test
	void testSaveOrder() {
		orderList = new ArrayList<>();
		addList = new ArrayList<Address>();
		itemOrderLine = new ArrayList<OrderLine>();
		order = new Order();
		order.setOrderId(1);
		order.setTotalAmount(45.23);
		order.setOrderDate(18);
		
		orderList.add(order);

		Address address = new Address();
		address.setRestName("Paradise");
		address.setPin(500031);
		address.setCity("Banglore");
		address.setCountry("India");
		
		addList.add(address);
		
		OrderLine orderLine = new OrderLine();
		orderLine.setItem(7);
		orderLine.setPrice(100.23);
		orderLine.setQuantity(5);
		orderLine.setETA(2);
		itemOrderLine.add(orderLine);

		when(repository.save(order)).thenReturn(order);
		Order Order = orderService.saveOrderDetails(order);
	
		
	}
}
