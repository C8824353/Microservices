/**
 * 
 */
package com.java.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.tech.entity.Payment;
import com.java.tech.service.PaymentService;

/**
 * @author vijay
 *
 */
@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment) {
		return service.doPayment(payment);
	}

}
