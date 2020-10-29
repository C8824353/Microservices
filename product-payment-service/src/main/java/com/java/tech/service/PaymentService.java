/**
 * 
 */
package com.java.tech.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.tech.entity.Payment;
import com.java.tech.repository.PaymentRepository;

/**
 * @author vijay
 *
 */
@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;

	public Payment doPayment(Payment payment) {
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
}
