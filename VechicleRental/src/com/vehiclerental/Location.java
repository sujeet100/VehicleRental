package com.vehiclerental;

public class Location {

	private String name;
	private Float distanceFromPune;
	private Float[] tolls;

	public Location(String name, Float distanceFromPune, Float... tolls) {
		this.name = name;
		this.distanceFromPune = distanceFromPune;
		this.tolls = tolls;

	}

	public Float getDistanceFromPune() {
		return distanceFromPune;
	}

	public Float getTotalToll() {
		Float totalToll = 0F;
		for (Float toll : tolls) {
			totalToll += toll;
		}
		return totalToll;
	}

	public String getLocationName() {
		return name;
	}
	
	

}
