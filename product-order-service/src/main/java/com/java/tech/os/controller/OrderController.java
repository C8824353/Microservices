/**
 * 
 */
package com.java.tech.os.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.tech.os.entity.Order;
import com.java.tech.os.service.OrderService;

/**
 * @author vijay
 *
 */
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/saveOrder")
	public Order saveOrder(@RequestBody Order order) {
		
		return service.saveOrder(order);
	}
}
