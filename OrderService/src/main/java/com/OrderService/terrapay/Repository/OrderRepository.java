package com.OrderService.terrapay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OrderService.terrapay.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

	Object getOrderByPinCode(Integer pincode);

	

}
