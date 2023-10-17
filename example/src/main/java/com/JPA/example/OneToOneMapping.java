package com.JPA.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import com.JPA.example.entity.Laptop;
import com.JPA.example.entity.StudentEntity;
import com.JPA.example.repository.JPARepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class OneToOneMapping {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMapping.class, args);
		
			
	}
	
	//@PostConstruct
	/*public void Save() {
		StudentEntity s1=new StudentEntity();
		//s1.setS_id(2);
		s1.setS_name("Anshika");
		s1.setS_age(24);

		Laptop l1= new Laptop();
		l1.setLaptopId(100);
		l1.setBrandName("HP");
		l1.setModelNumber("210");
		l1.setStudent(s1);

		jpaRepository.save(l1);
	}*/
	
	

}
