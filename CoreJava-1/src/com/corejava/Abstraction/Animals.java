package com.corejava.Abstraction;

public class Animals {

	private String name;
	private Integer limbs;
	private String place;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLimbs() {
		return limbs;
	}
	public void setLimbs(Integer limbs) {
		this.limbs = limbs;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public static void animals() {
		  System.out.println("animals");
	  }
}
