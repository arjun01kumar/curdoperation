package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class springstrater {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
	private String rollno;
		private String name;		
		private String gender;
		@Email
		
		private String email;
		
//		@Size(min = 9,max = 12)
		private String password;
}
