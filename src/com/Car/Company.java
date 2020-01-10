package com.Car;
import java.util.List;

public class Company {
	String name;
	private List<DealerShip> dealerships;
	
	Company(String name, List<DealerShip> dealerships){
		this.name = name;
		this.dealerships = dealerships;
	}
	
	public int getTotalCarsInDealerShip(){
		int noOfCars = 0;
		List<Car> cars;
		for(DealerShip d: dealerships)
		{
				cars = d.getCars();
				for(Car c: cars) 
				{
					if(c==null) {
						//do something
					}
					noOfCars++;
				}
		}
		return noOfCars;
	}
}
