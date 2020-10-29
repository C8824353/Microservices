/**
 * 
 */
package com.java.tech.os.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.tech.os.entity.Order;
import com.java.tech.os.repository.OrderRepository;

/**
 * @author vijay
 *
 */
@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public Order saveOrder(Order order) {
		// Business
		
		//Rest Template and Call the Payment using the URL of Payment Service
		
		return repository.save(order);
	}
	
}
