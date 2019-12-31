package com.corejava.Map;

import java.util.ArrayList;
import java.util.Map;

import com.corejava.Map.Model.Cars;
import com.corejava.Map.Service.MappingInterface;
import com.corejava.Map.Service.MappingInterfaceImpl;

public class Maps {

public static void main(String [] args) {
	 MappingInterface mappingInterface = new MappingInterfaceImpl();
   mappingInterface.hashMapping();
   Map<Cars, String> hmap = mappingInterface.hashMapping();
   Map<Cars, String> tmap1 = mappingInterface.treeMapping1();
   Map<Cars, String> tmap2 = mappingInterface.treeMapping2();
   Map<String , Cars> linkedHashMap = mappingInterface.linkedHashMapping();   
                }
         }
/*
 * https://howtodoinjava.com/java/collections/arraylist/linkedlist-vs-arraylist/
 * https://javarevisited.blogspot.com/2012/02/difference-between-linkedlist-vs.html
 * sublist on arraylist
 */
      