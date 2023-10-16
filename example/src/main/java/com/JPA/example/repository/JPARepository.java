package com.JPA.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPA.example.entity.Laptop;
import com.JPA.example.entity.StudentEntity;

public interface JPARepository extends JpaRepository<Laptop, Integer> {
	
}
