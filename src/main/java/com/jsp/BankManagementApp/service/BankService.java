package com.jsp.BankManagementApp.service;


import java.util.List;

import com.jsp.BankManagementApp.entity.BankDetails;

public interface BankService {
	
	public Object saveDetails(BankDetails bankDetails);
	
	public Object getDetailsById(int id);
	
	public List<BankDetails> getBankDetails(BankDetails bankDetails);
	
	public Object updateAll(BankDetails bankDetails);
	
	public Object updateById(int id, BankDetails bankDetails);
	
	public void deleteById(int id);
	
	public void deleteAll();
}
