package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

//JpaRepository already has methods to implement as an interfaceand inherits notation
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
