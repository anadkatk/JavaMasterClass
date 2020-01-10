package com.Car;
import java.util.List;

class DealerShip{
	
	String name;
	private List<Car> cars;
	
	DealerShip(String name, List<Car> cars){
		this.name = name;
		this.cars = cars;
	}
	
	public List<Car> getCars(){
		return cars;
	}
}