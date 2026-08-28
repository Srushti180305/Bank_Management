package com.jsp.BankManagementApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.BankManagementApp.dao.BankDao;
import com.jsp.BankManagementApp.entity.BankDetails;

@Service

public class BankServiceimpl implements BankService {
	
	@Autowired
	BankDao bankDao;;

	public Object saveDetails(BankDetails bankDetails) {
		if(bankDetails.getBalance() < 0) {
			return "balance should not be negative";
		}
		return bankDao.saveDetails(bankDetails);
	}
	
	public Object getDetailsById(int id) {
		return bankDao.getDetailsById(id);
	}
	
	public List<BankDetails> getBankDetails(BankDetails bankDetails) {
		return bankDao.getBankDetails(bankDetails);
	}
	
	public Object updateAll(BankDetails bankDetails) {
		return bankDao.updateAll(bankDetails);
	}
	
	public Object updateById(int id, BankDetails bankDetails) {
		Object obj = bankDao.getDetailsById(id);
		if(obj instanceof BankDetails) {
			BankDetails Bank = (BankDetails) obj;
			
			bankDetails.setUsername(bankDetails.getUsername());
			
			bankDetails.setAccountNumber(bankDetails.getAccountNumber());
			
			bankDetails.setAccountType(bankDetails.getAccountType());
			
			bankDetails.setBalance(bankDetails.getBalance());
			
			bankDetails.setBranch(bankDetails.getBranch());
			
			return bankDao.updateAll(Bank);
		}
		
		return obj;
	}
	
	public void deleteById(int id) {
		bankDao.deleteById(id);
	}
	
	public void deleteAll() {
		bankDao.deleteAll();
	}
	
}
