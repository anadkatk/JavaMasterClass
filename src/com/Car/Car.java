package com.Car;
class Car{
	
	
	int model_year, no_available;
	String make, model, color,dealership;
	//Constructor
	
	Car(int model_year, int no_available, String make,String model, String color, String dealership){
		this.model_year = model_year;
		this.no_available = no_available;
		this.make = make;
		this.model= model;
		this.color = color;
		this.dealership = dealership;
	}
	
	String get_color(){
		return  this.color;
	}
	
	void set_color(String color)
	{
		this.color = color;
	}
	public String print() {
		
		return ("Total Available cars = " + no_available + "\nmodel = " + model_year
				+ "\nMake = " + make + "\nModel = " + model + "\nColor = " + color + "\n");
		
	}
}
