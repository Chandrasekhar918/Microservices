package com.practice.microservice1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.practice.microservice1.entity.Bank;
@Repository
public interface Bankrepo extends JpaRepository<Bank,Integer> {

}
