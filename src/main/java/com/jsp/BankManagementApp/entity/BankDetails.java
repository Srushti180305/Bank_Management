package com.jsp.BankManagementApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
@Entity
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
	@NotBlank
 private String username;
	@NotNull
 private long accountNumber;
	@NotBlank
 private String accountType;
	@Positive
 private double balance;
	@NotBlank 
 private String branch;
}