package com.Car;
class SportsCar extends Car{
	public double Engine_size;
	public double Horse_power;
	public int mpg_city;
	public int mpg_highway;
	
	
	public SportsCar(int year, int no_available,String make, String model, String color,String dealership, double Engine_size, double Horse_power,int mpg_city, int mpg_highway) {
		super(year,no_available,make,model,color,dealership);
		this.Engine_size = Engine_size;
		this.Horse_power = Horse_power;
		this.mpg_city = mpg_city;
		this.mpg_highway = mpg_highway;
	}
	
	//setters and getters
	
	public String toString() {
		
		return (super.print() + "\nEngine Size = " + Engine_size
				+ "\nHorse Power = " +Horse_power+
				"\nMPG City = " + mpg_city + 
				"\nMPG Highway = " + mpg_highway);
	}
}