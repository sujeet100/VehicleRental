package com.vehiclerental;

public class SUV extends Vehicle {

	public SUV(String carName, int maxCapacity) {
		super(carName, FuelType.DIESEL, ACType.AC, maxCapacity);
	}

}
