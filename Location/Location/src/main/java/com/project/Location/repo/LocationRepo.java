package com.project.Location.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Location.entity.Location;

@Repository
public interface LocationRepo extends JpaRepository<Location,Integer> {

}
