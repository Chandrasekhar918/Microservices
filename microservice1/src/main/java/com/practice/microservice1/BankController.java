package com.practice.microservice1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.microservice1.entity.Bank;
import com.practice.microservice1.service.Bankservice;
@RestController
@RequestMapping("/bank")

public class BankController {
	@Autowired
	Bankservice ser;

@GetMapping("/all")	
public List<Bank> getall(){
	return ser.getall();
	
}

@GetMapping("/get/{id}")
public Bank get(@PathVariable int id) {
	return ser.get(id);		
}

@PostMapping("/add")
public String add(@RequestBody Bank bank) {
	return ser.add(bank);
	
}

@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
	return ser.delete(id);
}

@PutMapping("/update/{id}")
public String update(@PathVariable int id,@RequestBody Bank bank) {
	return ser.update(id, bank);
}




	
}
