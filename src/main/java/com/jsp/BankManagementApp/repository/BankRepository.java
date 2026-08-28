package com.jsp.BankManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.BankManagementApp.entity.BankDetails;

public interface BankRepository extends JpaRepository<BankDetails, Integer> {

}
