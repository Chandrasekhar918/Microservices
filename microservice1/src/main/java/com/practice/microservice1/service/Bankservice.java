package com.practice.microservice1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.microservice1.entity.Bank;

public interface Bankservice {
public String add(Bank bank);
public String delete(int id);
public String update(int id,Bank bank);
public Bank get(int id);
public List<Bank> getall();

}
