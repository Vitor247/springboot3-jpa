package com.vitorcamilodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorcamilodev.course.entities.OrderItem;
import com.vitorcamilodev.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
