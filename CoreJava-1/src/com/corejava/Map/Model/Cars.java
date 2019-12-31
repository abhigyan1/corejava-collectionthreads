package com.corejava.Map.Model;

public class Cars implements Comparable<Cars>{
private String model;
private String color;
private Integer price;
private String manufactureyear;
private Warehouse wearhouse;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public String getManufactureyear() {
	return manufactureyear;
}
public void setManufactureyear(String manufactureyear) {
	this.manufactureyear = manufactureyear;
}
public Warehouse getWearhouse() {
	return wearhouse;
}
public void setWearhouse(Warehouse wearhouse) {
	this.wearhouse = wearhouse;
}

@Override
public int compareTo(Cars o) {
	if(this.getPrice()>o.getPrice()) {
		return -1;
	}
       	else if(this.getPrice()<o.getPrice()) {
	      return 1;
	           }
            else {
                  return 0;
                   }
               }
         }