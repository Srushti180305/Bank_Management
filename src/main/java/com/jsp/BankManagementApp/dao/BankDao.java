   package com.jsp.BankManagementApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.BankManagementApp.entity.BankDetails;
import com.jsp.BankManagementApp.repository.BankRepository;

@Repository
public class BankDao {
	
	@Autowired
	private BankRepository bankRepository;
	
	public BankDetails saveDetails(BankDetails bankDetails) {
		return bankRepository.save(bankDetails);
	}
	
	public Object getDetailsById(int id) {
		Optional<BankDetails> op=bankRepository.findById(id);
		if(op.isPresent())
		return op.get();
	    else
	    	return "id not found"+id;
	}
	
	public List<BankDetails> getBankDetails(BankDetails bankDetails) {
		return bankRepository.findAll();

	}
	
	public Object updateAll(BankDetails bankDetails ) {
		return bankRepository.save(bankDetails);
	}
	
	
	public Object updateById(int id) {
		Optional<BankDetails> op=bankRepository.findById(id);
		if(op.isPresent())
		return op.get();
	    else
	    	return "id not found"+id;
	}
	
	public void deleteById(int id) {
		bankRepository.deleteById(id);
	}
	
	
	
	public void deleteAll() {
		bankRepository.deleteAll();
	}
}
