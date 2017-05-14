package com.edocti.jnext.spring.mvc;

import java.util.List;

public interface VehicleDAO {
	public void insert(Vehicle v);
	public void update(Vehicle v);
	public void delete(String VehicleNo);
	public Vehicle findByVehicleNo(String VehicleNo);
	public List<Vehicle> getAllVehicles();

}
