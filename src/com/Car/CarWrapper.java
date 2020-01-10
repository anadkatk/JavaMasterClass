package com.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class CarWrapper {
	Car C;
	
	CarWrapper(Car C){
		this.C = C;
	}
}

class A 
{ 
	
    
    void getx() {
    	int x = 10;
    	System.out.println(x);
    }
} 
  
// class B 

class B extends A 
{ 
	//@Override
	void getx() {
		int x = 20;
		System.out.println(x);
	}
     
    
} 



class Main{
	public static void swap(CarWrapper car1, CarWrapper car2) {
		Car temp = car1.C;
		car1.C = car2.C;
		car2.C = temp;
	}
	
	public static void kevin() throws IOException{
		//Association, Composition and Aggregation in Java
		
		//To do
		//Set current transmission mode
		//set interfaces
		
		System.out.println("You are inside function Kevin");
		
		Transmission t1 = new Transmission(6);
		t1.set_GearType('m');
		t1.set_FuelType('g');
		
		SportsCar TypeR = new SportsCar(2019,3,"Honda","Civic Type R", "Red","Aurora" , 2.0,306,22,28);
		SportsCar Nissan_370_Z = new SportsCar(2017,1,"Nissan","370 Z Nismo","Grey","Chicago", 3.7, 350,19,26);
		
		System.out.println(TypeR.toString());
		System.out.println(t1.toString());

		//Reading from the file
		ReadFromFile rff = new ReadFromFile();

		String fileRead =  rff.readFile();
		String[] words = fileRead.split(" ");

		for (String word:words){
			System.out.print(word + " ");
			if(word.contains("abc")){
				System.out.println("The file contains abc");
				break;
			}
		}
		//System.out.println(fileRead);

		//End of reading from the file.

		Car civic = new Car(2007,5,"Honda","Civic","Blue","Aurora");
		Car Accord = new Car(2012,7,"Honda","Accord","Red","Chicago");
		Car Camry = new Car(2017,4,"Toyota","Camry","White","Chicago");
		Car Corolla = new Car(2019,18,"Toyota","Corolla","Black","Oak Lawn");
		
		List <Car> aurora_cars = new ArrayList<Car>();
		aurora_cars.add(civic);
		aurora_cars.add(TypeR);
		
		List <Car> Chicago_cars = new ArrayList<Car>();
		Chicago_cars.add(Accord);
		Chicago_cars.add(Nissan_370_Z);
		Chicago_cars.add(Camry);
		
		List<Car> Oak_Lawn_Cars = new ArrayList<Car>();
		Oak_Lawn_Cars.add(Corolla);
		
		DealerShip Aurora = new DealerShip("Aurora",aurora_cars);
		DealerShip Chicago = new DealerShip("Chicago", Chicago_cars);
		DealerShip Oak_Lawn = new DealerShip("Oak Lawn", Oak_Lawn_Cars);
		
		List <DealerShip> dealerships = new ArrayList<DealerShip>();
		dealerships.add(Aurora);
		dealerships.add(Chicago);
		dealerships.add(Oak_Lawn);
		Company Honda = new Company("Honda",dealerships);

		String abbc = TypeR.toString();
		FileOutputStream targetStream = null;
		ObjectOutputStream objectOut = null;
		try
		{
			targetStream = new FileOutputStream("Report2019FileInventory.txt");
			try (ObjectOutputStream objectOutputStream = objectOut = new ObjectOutputStream(targetStream)) {

				objectOut.writeObject("Tyr");
				System.out.println("The print out to the file is ");
				System.out.println(TypeR.toString());

			}finally {
				if(objectOut !=null){
					objectOut.close();
				}
			}



		}
		finally {
			if(targetStream !=null){
				targetStream.close();
			}
		}

	}
	public static void main(String[] args) throws IOException {

		int arr[] = {10,20,35,44,52,67,78,88,95};
		Arrays.sort(arr);
		
		int key = 35;
		int res= Arrays.binarySearch(arr, key);
		if (res >0) {
			System.out.println(key + " Found at index = " + res);
			
		}
		else {
			System.out.println(key + " not found");
		}
		kevin();
		
		//A a = new B();
		//a.getx();
		/* Swapping Demo
		CarWrapper civic07 = new CarWrapper(civic);
		CarWrapper Accord12 = new CarWrapper(Accord);
		
		swap(civic07,Accord12);
		
		System.out.println("\n" + civic07.C.print());
		System.out.println("\n" + Accord12.C.print());
		System.out.println("foo");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Set new color for Civic : ");
		String newColor = scan.nextLine();
		
		
		civic.set_color(newColor);
		
		System.out.println("New Color is " + civic.get_color());
		*/
	}
}