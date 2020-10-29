/**
 * 
 */
package com.java.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.tech.entity.Payment;

/**
 * @author vijay
 *
 */
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
