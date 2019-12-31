package com.corejava.Map.Service;

import java.util.Comparator;

import com.corejava.Map.Model.Cars;

public class CarYearComparator implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		Cars car1 = (Cars)o1;
		Cars car2 = (Cars)o2;
		int result = car1.getManufactureyear().compareTo(car2.getManufactureyear());
		if(result==0) {
			result = car1.getPrice().compareTo(car2.getPrice());
			    if(result==0) {
			    	result = car1.getWearhouse().getDistance().compareTo(car2.getWearhouse().getDistance());
			    }
			    	
		}
		return result ;
		}
	}


