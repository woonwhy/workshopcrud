package com.example.crud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
	
	@Column(name = "eng_name", nullable = false)
	private String eng_name ; 
	
	@Column(name = "email", nullable = false)
	private String email ; 

	@Column(name = "falculty", nullable = false)
	private String faculty ; 
	
	@Column(name = "type", nullable = false)
	private String type ; 
	
	@Column(name = "user_name", nullable = false)
	private String userName ; 
}