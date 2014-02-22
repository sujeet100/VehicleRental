package com.vehiclerental;

public class Trip {

	private static final float MAX_CAPACITY_EXCEDES_EXTRA_CHARGES = 1.5F;
	private Location destination;
	private Vehicle vehicle;
	private Location source;
	private int numberOfPassengers;

	public Trip(Vehicle car, Location source, Location destination, int noOfPassengers) {
		this.vehicle = car;
		this.source = source;
		this.destination = destination;
		this.numberOfPassengers = noOfPassengers;
	}

	public Float getTotalExpense() {
		
		Float rate = vehicle.getRate();
		
		if(vehicle.excedesMaxLimit(numberOfPassengers)){
			rate = rate + MAX_CAPACITY_EXCEDES_EXTRA_CHARGES * (numberOfPassengers - vehicle.getMaxCapacity());
		}
		
		Float expense = rate * totalTripDistance();
		
		expense += destination.getTotalToll();
		
		return expense;
	}
	
	public Float totalTripDistance(){
		return source.getDistanceFromPune() + destination.getDistanceFromPune();
	}

}
