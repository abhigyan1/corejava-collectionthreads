package com.corejava.Abstraction;

public class Horse extends AbstractAnimals {

	@Override
	public Integer displayLimb(Integer i) {
		// TODO Auto-generated method stub
		System.out.println("Horse has"+i+ "limbs");
		return 4;
	}

	@Override
	public String displayPlace() {
		System.out.println("displaying place: it's canada");
		return "displaying place: it's canada";
	}
	public String displayName(String x) {
		return x+"lo";
	}
	public static void horse() {
		  System.out.println("horse");
	  }
}
