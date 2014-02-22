package com.vehiclerental;

public class Vehicle {

	private static final int DIESEL_VEHICLE_DISCOUNT_RATE = 1;
	private static final int EXTRA_CHARGES_FOR_AC = 2;
	private String vehicleName;
	private FuelType fuleType;
	private ACType acType;
	private int maxCapacity;

	public Vehicle(String carName, FuelType fuleType, ACType acType, int maxCapacity) {
		this.vehicleName = carName;
		this.fuleType = fuleType;
		this.acType = acType;
		this.maxCapacity = maxCapacity;

	
	}

	public Float getRate() {
		
		Float rate = Constants.STANDARD_RATE;
		
		if(fuleType.equals(FuelType.DIESEL)){
			rate -= DIESEL_VEHICLE_DISCOUNT_RATE;
		}
		
		if(acType.equals(ACType.AC)){
			rate+=EXTRA_CHARGES_FOR_AC;
		}
		
		return rate;
	}

	public boolean excedesMaxLimit(int numberOfPassengers) {
		return numberOfPassengers > maxCapacity ;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}
	
}
