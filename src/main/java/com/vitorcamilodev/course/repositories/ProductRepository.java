package com.vitorcamilodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorcamilodev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
