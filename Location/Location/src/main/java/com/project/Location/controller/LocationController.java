package com.project.Location.controller;

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

import com.project.Location.entity.Location;
import com.project.Location.repo.LocationRepo;
import com.project.Location.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {

	
@Autowired(required = false)
LocationService locationService;

@PostMapping("/add")
public String addLocation(@RequestBody Location loc) {
	return locationService.add(loc);
	
}

@GetMapping("/findall")
public List<Location> findallLocations(){
	return locationService.findall();
}

@GetMapping("/find/{centerId}")
public Location findId(@PathVariable int centerId) {
	return locationService.findbyId(centerId);
}

@PutMapping("/update/{centerId}")
public String updateLocation(@RequestBody Location loc,@PathVariable int centerId) {
	return locationService.update(loc, centerId);
		
	}

@DeleteMapping("/delete/{centerId}")
public String deleteLocation(@PathVariable int centerId)
{
	return locationService.del(centerId);
}

}
