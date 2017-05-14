package com.edocti.jnext.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	private VehicleDAO vehicleDAO;
	
	@Override
	public List<Vehicle> getAllVehicles() {
		return vehicleDAO.getAllVehicles();
	}

	@Override
	public Vehicle findVehicle(String vehicleNo) {
		return vehicleDAO.findByVehicleNo(vehicleNo);
	}

	@Override
	public void addVehicle(Vehicle v) {
		vehicleDAO.insert(v);
	}

	@Override
	public void updateVehicle(Vehicle v) {
		vehicleDAO.update(v);
	}

	@Override
	public void removeVehicle(String VehicleNo) {
		vehicleDAO.delete(VehicleNo);
	}

}
