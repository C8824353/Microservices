/**
 * 
 */
package com.java.tech.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.tech.os.entity.Order;

/**
 * @author vijay
 *
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
