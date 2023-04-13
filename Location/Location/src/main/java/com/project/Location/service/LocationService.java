package com.project.Location.service;

import java.util.List;



import com.project.Location.entity.Location;

public interface LocationService {

	public List<Location> findall();
	public Location findbyId(int centerId);
	public String add(Location loc);
	public String del(int centerId);
	public String update(Location loc,int centerId);
	
	
	
}
