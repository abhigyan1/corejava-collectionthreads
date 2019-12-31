package com.corejava.Map;

import java.util.ArrayList;
import java.util.List;

import com.corejava.Map.Model.Cars;
import com.corejava.Map.Model.Warehouse;
import com.corejava.Map.Service.OperationManager;

public class DataCars implements OperationManager {
	@Override
	public List<Cars> createCar() {
		// TODO Auto-generated method stub
	Cars suzuki = new Cars();
	suzuki.setColor("Blue");
	suzuki.setManufactureyear("2017");
	suzuki.setPrice(1000);
	suzuki.setModel("Suzuki");
	suzuki.setWearhouse(createWarehouse().get(0));
	
	Cars mercedez = new Cars();
	mercedez.setColor("Black");
	mercedez.setPrice(5000);
	mercedez.setManufactureyear("2019");
	mercedez.setModel("mercedez");
	mercedez.setWearhouse(createWarehouse().get(1));
	
	Cars ford = new Cars();
	ford.setColor("Black");
	ford.setManufactureyear("2019");
	ford.setPrice(5000);
	ford.setModel("ford");
	ford.setWearhouse(createWarehouse().get(2));
	
	Cars lexus = new Cars();
	lexus.setColor("White");
	lexus.setManufactureyear("2020");
	lexus.setPrice(3000);
	lexus.setModel("lexus");
	lexus.setWearhouse(createWarehouse().get(0));
	
	Cars polo = new Cars();
	polo.setColor("Red");
	polo.setManufactureyear("2018");
	polo.setPrice(2500);
	polo.setModel("polo");
	polo.setWearhouse(createWarehouse().get(2));
	
	Cars bmw = new Cars();
	bmw.setColor("Black");
	bmw.setPrice(5200);
	bmw.setManufactureyear("2019");
	bmw.setModel("bmw");
	bmw.setWearhouse(createWarehouse().get(2));
	
	// Create an List of the Cars
	List<Cars> allcars = new ArrayList<Cars>();
	allcars.add(lexus);
	allcars.add(ford);
	allcars.add(mercedez);
	allcars.add(bmw);
	allcars.add(polo);
	allcars.add(suzuki);
	
	return allcars;
	}

	@Override
	public List<Warehouse> createWarehouse() {
		Warehouse scarborugh_east = new Warehouse();
		scarborugh_east.setDistance(10);
		scarborugh_east.setLocation("ScarboroughEast");
		
		Warehouse scarborugh_west = new Warehouse();
		scarborugh_west.setDistance(5);
		scarborugh_west.setLocation("ScarboroughWest");
		
		Warehouse dundas = new Warehouse();
		dundas.setDistance(30);
		dundas.setLocation("Dundas");
		
		List<Warehouse> allWarehouses = new ArrayList<Warehouse> ();
		allWarehouses.add(scarborugh_east);
		allWarehouses.add(scarborugh_west);
		allWarehouses.add(dundas);
		
		return allWarehouses;
	}
	
	
	
}
