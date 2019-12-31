package com.corejava.Map.Service;

import java.util.List;
import java.util.Map;

import com.corejava.Map.Model.Cars;
import com.corejava.Map.Model.Warehouse;

public interface CarService {
	public Map<List<Cars>, List<Warehouse>> adaptServicingHashMapvoid();
	public Map<Cars, String> adaptServicingHashMap();
	public Map<Cars, String> adaptServiceTreeMap1();
	public Map<Cars, String> adaptServiceTreeMap2();
	public Map<String, Cars> adaptServiceLinkedHashMap();
	
	
}
