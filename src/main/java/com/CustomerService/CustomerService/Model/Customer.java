package com.CustomerService.CustomerService.Model;


import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


	@Data
	@Table
	@Entity
	public class Customer { 
		 
		

	
		

		@Id
		@GeneratedValue(strategy = GenerationType.UUID)
		@Column
		private UUID customerId; 
		
		@Column
		private String tcKimlikNo;
		
		@Column
		private String customerName;
		
		@Column
		private String customerLastName;
		
		@Column(nullable=true)
		private LocalDate dateofBirth;

		@Column
		private String phoneNumber;
		
		@Column
		private String email;

		
		
		
		
		

}
