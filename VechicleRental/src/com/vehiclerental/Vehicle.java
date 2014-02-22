package com.vehiclerental;

public class Vehicle {

	private static final int DIESEL_VEHICLE_DISCOUNT_RATE = 1;
	private static final int EXTRA_CHARGES_FOR_AC = 2;
	public static final boolean AC = true;
	public static final boolean NONAC = false;
	
	private String vehicleName;
	private FuelType fuleType;
	private boolean isAC;
	private int maxCapacity;
	private Float mileage;

	public Vehicle(String carName, FuelType fuleType, boolean isAC, int maxCapacity) {
		this.vehicleName = carName;
		this.fuleType = fuleType;
		this.isAC = isAC;
		this.maxCapacity = maxCapacity;

	
	}

	public Vehicle(String carName, FuelType fuleType, boolean isAC, int maxCapacity,
			Float mileage) {
		this.vehicleName = carName;
		this.mileage = mileage;
		this.fuleType = fuleType;
		this.isAC = isAC;
		this.maxCapacity = maxCapacity;

	}

	public Float getRate() {
		
		Float rate = Constants.STANDARD_RATE;
		
		if(fuleType.equals(FuelType.DIESEL)){
			rate -= DIESEL_VEHICLE_DISCOUNT_RATE;
		}
		
		if(isAC){
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

	public FuelType getFuelType() {
		return fuleType;
	}

	public Float getMileage() {
		return	isAC ? mileage - 2: mileage;
	}

	public String getVehicleName() {
		return vehicleName;
	}
	
}

