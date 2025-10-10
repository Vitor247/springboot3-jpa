package com.vitorcamilodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorcamilodev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
