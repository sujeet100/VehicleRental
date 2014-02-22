package com.vehiclerental;

public class Car extends Vehicle {

	public Car(String carName, FuelType fuleType, boolean acType) {
		super(carName, fuleType, acType, 5);
	}

	public Car(String carName, FuelType fuleType, boolean isAC, Float mileage) {
		super(carName, fuleType, isAC, 5, mileage);
	}

}
