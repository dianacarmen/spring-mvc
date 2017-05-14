package com.edocti.jnext.spring.mvc;

import java.util.List;

public interface VehicleService {
	
	List<Vehicle> getAllVehicles();
	Vehicle findVehicle(String vehicleNo);
	void addVehicle(Vehicle v);
	void updateVehicle(Vehicle v);
	void removeVehicle(String VehicleNo);
	
}

