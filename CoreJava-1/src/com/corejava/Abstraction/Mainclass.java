package com.corejava.Abstraction;

public class Mainclass {
  public static void main(String[] args) {
	  AbstractAnimals horse = new Horse();
	  System.out.println("horse in main display name "+ horse.displayName("horse"));
	  System.out.println("horse in main display limb "+ horse.displayLimb(4));
	  System.out.println("horse in main display Name "+ horse.displayPlace());
	  
  }
  public static void main() {
	  System.out.println("main");
  }
}
