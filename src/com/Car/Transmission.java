package com.Car;
public class Transmission{
	public int no_Of_Gears;
	
	//enum for gear type;
	enum TransmissionGearTypeEnum{
		auto,
		manual;
	};
	
	enum FuelTypeEnum {
	    gasoline,
	    methanol,
	    ethanol,
	    diesel,
	    lpg,
	    cng,
	    electric;
	};


	TransmissionGearTypeEnum transmissionGearTypeEnum;
	FuelTypeEnum fuelTypeEnum;
	
	public Transmission(int no_Of_Gears)
	{
		this.no_Of_Gears = no_Of_Gears;
	}
	public Transmission(int no_Of_Gears, TransmissionGearTypeEnum transmissionGearTypeEnum , FuelTypeEnum fuelTypeEnum) 
	{
		
		this.no_Of_Gears = no_Of_Gears;
		this.transmissionGearTypeEnum = transmissionGearTypeEnum;
		this.fuelTypeEnum = fuelTypeEnum;
	}
	
	
	
	public void set_GearType(char type) {
		
		if (type =='a')
		{
			transmissionGearTypeEnum = TransmissionGearTypeEnum.auto;
			
		}
		else if(type == 'm')
		{
			
			transmissionGearTypeEnum  = TransmissionGearTypeEnum.manual;
		}
		else
		{
			System.out.println("Unable to set Gear Type");
			
		}
	}

public void set_FuelType(char type) {
		/*
		 gasoline,
	    methanol,
	    ethanol,
	    diesel,
	    lpg,
	    cng,
	    electric;
		 */
		if (type =='g')
		{
			fuelTypeEnum = FuelTypeEnum.gasoline;
			
		}
		else if(type == 'm')
		{
			
			fuelTypeEnum = FuelTypeEnum.methanol;
		}
		else if(type == 'e')
		{
			
			fuelTypeEnum = FuelTypeEnum.ethanol;
		}
		else if(type == 'd')
		{
			
			fuelTypeEnum = FuelTypeEnum.diesel;
		}
		else if(type == 'l')
		{
			
			fuelTypeEnum = FuelTypeEnum.lpg;
		}
		else if(type == 'c')
		{
			
			fuelTypeEnum = FuelTypeEnum.cng;
		}
		else if(type == 'x')
		{
			
			fuelTypeEnum = FuelTypeEnum.electric;
		}
		else
		{
			System.out.println("Unable to set fuel type");
			
		}
	}

	public String toString() {
		
		return ( "\nNumber of Gears = " + no_Of_Gears + 
				" \nTransmission Type is " + transmissionGearTypeEnum + 
				"\nFuel Type is " + fuelTypeEnum);
	}
	
}
/*


enum TransmissionMode {
    "park",
    "reverse",
    "neutral",
    "low",
    "drive",
    "overdrive"
};

interface TransmissionOil : VehicleCommonDataType {
	/*temperature of type byte, readonly , nullable
must return current temperature of the transmission oil(Unit: celsius).
wear of type octet, readonly , nullable
must return transmission oil wear (Unit: percentage, 0: no wear, 100: completely worn).*/
    /*
	readonly    attribute octet? wear;
    readonly    attribute byte?  temperature;
};

interface TransmissionClutch : VehicleCommonDataType {
  //must return transmission clutch wear (Unit: percentage, 0%: no wear, 100%: completely worn).
	readonly    attribute octet wear;
};*/