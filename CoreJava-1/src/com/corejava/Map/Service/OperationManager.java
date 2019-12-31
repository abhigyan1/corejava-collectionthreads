package com.corejava.Map.Service;

import java.util.List;

import com.corejava.Map.Model.Cars;
import com.corejava.Map.Model.Warehouse;

public interface OperationManager {

	public List<Cars> createCar();
	public List<Warehouse> createWarehouse();
}
