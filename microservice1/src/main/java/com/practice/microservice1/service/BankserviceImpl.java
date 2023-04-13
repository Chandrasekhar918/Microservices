package com.practice.microservice1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.practice.microservice1.entity.Bank;
import com.practice.microservice1.repo.Bankrepo;
@Service
public class BankserviceImpl implements Bankservice {
@Autowired
	Bankrepo repo;
	


	@Override
	public String delete(int id) {
		java.util.Optional<Bank> cont=repo.findById(id);
		if(cont.isPresent()) {
			Bank b=cont.get();
			repo.delete(b);
			return "data deleted successfully with id"+id;
		}
		else {
			return "not found";
		}
		
	}

	@Override
	public String update(int id, Bank bank) {
		java.util.Optional<Bank> con=repo.findById(id);
		if(con.isPresent()) {
			Bank b=con.get();
			b.setBankname(bank.getBankname());
			b.setId(bank.getId());
			b.setName(bank.getName());
			b.setPhoneno(bank.getPhoneno());
			repo.save(b);
			return "Data updated successfully with id"+bank.getId();
		}
		else {
			return "Id not found";
		}
		
	
	}

	@Override
	public Bank get(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Bank> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String add(Bank bank) {
		repo.save(bank);
		return "data added successfully with id"+ bank.getId();
	}

}
