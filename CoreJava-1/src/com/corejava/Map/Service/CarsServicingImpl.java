package com.corejava.Map.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

import com.corejava.Map.DataCars;
import com.corejava.Map.Model.Cars;
import com.corejava.Map.Model.Warehouse;

public class CarsServicingImpl implements CarService {
                  // HashMapping the model values 
	Map<Cars, String> hashMap = new HashMap<Cars, String>();
	Map<Cars, String> treeMap = new TreeMap<Cars, String>();
	Map<Cars, String> treeMap2 = new TreeMap<Cars, String>(new CarYearComparator());
	Map<String, Cars> linkedHashMap = new LinkedHashMap<String, Cars>(2,0.75f, true);
	public Map<List<Cars>, List<Warehouse>> adaptServicingHashMapvoid()  {
		OperationManager operationManager = new DataCars();
		List<Cars> allcars = operationManager.createCar();
		List<Warehouse> allWarehouses = operationManager.createWarehouse();
		Map<List<Cars>, List<Warehouse>> servicing = new HashMap<List<Cars>, List<Warehouse>>();
		servicing.put(allcars, allWarehouses);
		return servicing;
	}

     @Override
	  public Map<Cars, String> adaptServicingHashMap() {
					// 
	   OperationManager operationManager = new DataCars();
	   List<Cars> allcars = operationManager.createCar();
		    try {
			     	if(!(allcars.isEmpty())) {
					       for(Cars car: allcars) {
						      System.out.println("car model"+car.getModel());
					              hashMap.put(car, car.getModel());
					         }
						 }	
			     }
			     	catch(Exception npe) {
						System.out.println(" exception wrong happened:"+npe.getStackTrace());
					}
					
            return hashMap;
				}

	@Override
	public Map<Cars, String> adaptServiceTreeMap1() {
		// TODO Auto-generated method stub
		OperationManager operationManager = new DataCars();
		   List<Cars> allcars = operationManager.createCar();
		   try {
		     	if(!(allcars.isEmpty())) {
				       for(Cars car: allcars) {
					      System.out.println("car model"+car.getModel());
					      treeMap.put(car, car.getModel());
				         }
					 }
		        }
				catch(NullPointerException npe) {
					System.out.println("null exception wrong happened:"+npe.getStackTrace());
				}
		     	catch(Exception npe) {
					System.out.println(" exception wrong happened:"+npe.getStackTrace());
				}
				
                     return treeMap;
			           }

	@Override
	public Map<Cars, String> adaptServiceTreeMap2() {
		// TODO Auto-generated method stub
		OperationManager operationManager = new DataCars();
		   List<Cars> allcars = operationManager.createCar();
		   System.out.println("car size in list"+allcars.size());
		   try {
		     	if(!(allcars.isEmpty())) {
				       for(Cars car: allcars) {
					      System.out.println("car model"+car.getModel());
					      treeMap2.put(car, car.getModel());
					      System.out.println("size of treeMap"+treeMap2.size());
				         }
					 }	
		        }
				catch(NullPointerException npe) {
					System.out.println("null exception wrong happened:"+npe.getStackTrace());
				}
		     	catch(Exception npe) {
					System.out.println(" exception wrong happened:"+npe.getMessage());
				}
				
                     return treeMap2;
			           }

	@Override
	public Map<String, Cars> adaptServiceLinkedHashMap() {
		OperationManager operationManager = new DataCars();
		   List<Cars> allcars = operationManager.createCar();
		   try {
		     	if(!(allcars.isEmpty())) {
				       for(Cars car: allcars) {
					    //  System.out.println("car model"+car.getModel());
					      linkedHashMap.put(car.getModel(), car);
					     //System.out.println("size of LinkedMap"+linkedHashMap.size());
				         }
					 }	
		        }
				catch(NullPointerException npe) {
					System.out.println("null exception wrong happened:"+npe.getStackTrace());
				}
		     	catch(Exception npe) {
					System.out.println(" exception wrong happened:"+npe.getMessage());
				}
				
                    return linkedHashMap;
	}
	
	}
