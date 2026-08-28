package com.jsp.BankManagementApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jsp.BankManagementApp.entity.BankDetails;
import com.jsp.BankManagementApp.service.BankService;

@RestController
@RequestMapping("/details")

public class BankController {
	
	@Autowired
	BankService bankService;
	
	
     @PostMapping
	public Object saveDetails(@RequestBody BankDetails bankDetails) {
		 return bankService.saveDetails(bankDetails);
		 
	}
     
     @GetMapping("/id")
     public Object getDetailsById(@RequestBody BankDetails bankDetails) {
		 return bankService.getDetailsById(bankDetails.getId());
		 
	 }
     
	 @GetMapping
	 public List<BankDetails> getBankDetails(BankDetails bankDetails) {
		 return bankService.getBankDetails(bankDetails);
		 
	 }
	 
	 @PutMapping
	 public Object updateAll(@RequestBody BankDetails bankDetails) {
		 return bankService.updateAll(bankDetails);
		 
	 }
	 
	 @PatchMapping
	 public Object updateById(@PathVariable int id,@RequestBody BankDetails bankDetails) {
		 return bankService.updateById(id, bankDetails);
		 
	 }
	 
	 @DeleteMapping("/id")
	 public void deleteById(@RequestBody int id) {
		 bankService.deleteById(id);
		 
	 }
	 
	 @DeleteMapping
	 public void deleteAll() {
		 bankService.deleteAll();
		 
	 }
	 
}
