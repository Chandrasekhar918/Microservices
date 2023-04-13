package com.project.Location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Location.entity.Location;
import com.project.Location.repo.LocationRepo;

@Service
public class LocationServiceImpl implements LocationService {


@Autowired
LocationRepo repo;

	@Override
	public List<Location> findall() {
		
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

	@Override
	public String add(Location loc) {
		// TODO Auto-generated method stub
		 repo.save(loc);
		 return "Location Details added successfully with centerId"+ " "+ loc.getCenterId();
	}

	@Override
	public String del(int centerId) {
		Optional<Location> cont=repo.findById(centerId);
		if(cont.isPresent()) {
			repo.deleteById(centerId);
		
		
		// TODO Auto-generated method stub
		return "Location Details are deleted successfully ";
		}
		else {
			return "Id not found ";
		}
		
		
		
	}

	@Override
	public String update(Location loc, int centerId) {
		Optional<Location> cont=repo.findById(centerId);
		if(cont.isPresent()) {
			Location l=cont.get();
			l.setLocation(loc.getLocation());
		l.setCenterName(loc.getCenterName());
		l.setEmail(loc.getEmail());
		l.setContact(loc.getContact());
		l.setCost(loc.getCost());
		l.setTotalCapacity(loc.getTotalCapacity());
		l.setDescription(loc.getDescription());
		repo.save(l);
		
		// TODO Auto-generated method stub
		return "Location Details updated successfully with centerId"+ " "+ loc.getCenterId();
	}
	else {
		return "Id not found";
	}
	}
	@Override
	public Location findbyId(int centerId) {
		
		return repo.findById(centerId).get();
	}

}
