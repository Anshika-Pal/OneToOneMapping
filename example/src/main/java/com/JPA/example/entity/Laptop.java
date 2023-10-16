package com.JPA.example.entity;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Laptop {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int laptopId;
	private String ModelNumber;
	private String brandName;

	public Laptop(int laptopId, String modelNumber, String brandName, StudentEntity student) {
		super();
		this.laptopId = laptopId;
		ModelNumber = modelNumber;
		this.brandName = brandName;
		this.student = student;
	}
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getModelNumber() {
		return ModelNumber;
	}

	public void setModelNumber(String modelNumber) {
		ModelNumber = modelNumber;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "s_id")
	private  StudentEntity student;
}
