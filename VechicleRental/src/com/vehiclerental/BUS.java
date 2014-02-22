package com.vehiclerental;

public class BUS extends Vehicle {

	private static final Float discountInPercentage = 2F;
	
	public BUS(String carName, boolean isAC, int maxCapacity) {
		super(carName, FuelType.DIESEL, isAC, maxCapacity);
	}

	@Override
	public Float getRate() {
		Float rate = super.getRate();
		return  rate - (rate*discountInPercentage/100);
	}
}
