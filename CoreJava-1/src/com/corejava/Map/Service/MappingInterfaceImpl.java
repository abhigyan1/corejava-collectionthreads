package com.corejava.Map.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;

import com.corejava.Map.Model.Cars;
import com.corejava.Map.Model.Warehouse;

public class MappingInterfaceImpl implements MappingInterface {

	@Override
	public void hashMappingvoid() {
		CarService carsServicing = new CarsServicingImpl();
		Set<Entry<List<Cars>, List<Warehouse>>> entrySet = carsServicing.adaptServicingHashMapvoid().entrySet();
		 System.out.println("Size is:"+ entrySet.size());
		 List<Cars> carCollectorList= new ArrayList<Cars>();
	    
		 if(!(entrySet.isEmpty())) {
	    	     if(entrySet.iterator().hasNext()) {
	    	      List<Cars> carList= entrySet.iterator().next().getKey();
	    	      System.out.println("Number of cars"+carList.size());
	    	      Iterator<Cars> it = carList.iterator();
	    	             while(it.hasNext()) {
	                             carCollectorList.add(it.next());  	  
	    	                 }
	                       for(Cars car: carCollectorList) {
	        	                System.out.println("car's model is:"+car.getModel()+"car's warehouse is:"+car.getWearhouse().getLocation());
	        	               }
	                       }
	                     }
		              }

           	@Override
	        public Map<Cars, String> hashMapping() {
		           CarService carsServicing = new CarsServicingImpl();
		              return  carsServicing.adaptServicingHashMap();
	                   }

			@Override
			public Map<Cars, String> treeMapping1() {
				// TODO Auto-generated method stub
				CarService carsServicing = new CarsServicingImpl();
	              return  carsServicing.adaptServiceTreeMap1();
			}

			@Override
			public Map<Cars, String> treeMapping2() {
				CarService carsServicing = new CarsServicingImpl();
				TreeMap<Cars, String> tmap2 =(TreeMap<Cars, String>) carsServicing.adaptServiceTreeMap2();
				Set<Cars> carsSet = tmap2.keySet();
			    tmap2.entrySet().iterator();
			    System.out.println("number ofcars"+carsSet.size());
			    
			    Iterator<Entry<Cars, String>> it =tmap2.entrySet().iterator();
			        
			             while(it.hasNext()) {
			             	//System.out.println("Manufacturing year of car is:"+it.next().getManufactureyear());
			        	       System.out.println("Price year of car is:"+it.next().getKey().getModel());
			                              }
			                  	return  carsServicing.adaptServiceTreeMap2();
			                          }

			@Override
			public Map<String, Cars> linkedHashMapping() {
				CarService carsServicing = new CarsServicingImpl();
				 Map<String, Cars> lmap = new LinkedHashMap<String, Cars>(2,0.75f, true);
				    lmap = (LinkedHashMap<String, Cars>) carsServicing.adaptServiceLinkedHashMap();
				  
				       lmap.get("bmw");
				      Iterator<Entry<String, Cars>> i = lmap.entrySet().iterator();
				         while(i.hasNext()) {
				        	 Map.Entry<String, Cars> map = i.next();
				        	 System.out.println("key is"+map.getKey()+"value is"+ map.getValue().getModel());
				         }
				       
				return carsServicing.adaptServiceLinkedHashMap();
			
			}
                                }
                   
