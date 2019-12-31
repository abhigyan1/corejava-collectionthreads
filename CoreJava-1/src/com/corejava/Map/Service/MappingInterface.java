package com.corejava.Map.Service;

import java.util.Map;

import com.corejava.Map.Model.Cars;

public interface MappingInterface {
	//implementation of hashMap
	public void hashMappingvoid();
	//implementation of hashMap with string type
    public Map<Cars, String> hashMapping();
	//implementation of treeMap with String type
	public Map<Cars, String> treeMapping1();
	//implementation of treeMap with String type and comparator sorting
	public Map<Cars, String> treeMapping2();
	//implementation of linkedhashmapping
	public Map<String, Cars> linkedHashMapping();
}
