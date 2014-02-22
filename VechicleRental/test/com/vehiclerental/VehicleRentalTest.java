package com.vehiclerental;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VehicleRentalTest {

	@Test
	public void itGivesCorrectTotalExpenseFor_A_Petrol_NonAC_Car() {
		
		Trip trip = new Trip(
				new Car("Swift", FuelType.PETROL, Vehicle.NONAC),
				new Location("PUNE", 0F),
				new Location("MUMBAI",200F),
				5);
		assertEquals(new Float(1800), trip.getTotalExpense());
	
	}
	
	@Test
	public void itGivesCorrectTotalExpenseFor_A_Petrol_AC_Car() {
		
		Trip trip = new Trip(
				new Car("Swift", FuelType.PETROL, Vehicle.AC),
				new Location("PUNE", 0F),
				new Location("MUMBAI",200F),
				5);
		assertEquals(new Float(2200), trip.getTotalExpense());
	
	}

	@Test
	public void itGivesCorrectTotalExpenseFor_A_Diesel_AC_Car() {
		
		Trip trip = new Trip(
				new Car("Swift", FuelType.DIESEL, Vehicle.AC),
				new Location("PUNE", 0F),
				new Location("MUMBAI",200F),
				5);
		assertEquals(new Float(2000), trip.getTotalExpense());
	
	}
	
	@Test
	public void itGivesCorrectTotalExpenseFor_A_SUV() {
		
		Trip trip = new Trip(
				new SUV("Mahindra XUV 500", 7),
				new Location("MUMBAI", 200F),
				new Location("BANGALORE",1000F),
				7);
		assertEquals(new Float(12000), trip.getTotalExpense());
	
	}
	
	@Test
	public void itGivesCorrectTotalExpenseFor_AN_AC_BUS() {
		
		Trip trip = new Trip(
				new BUS("Tata skyline", Vehicle.AC, 40),
				new Location("MUMBAI", 200F),
				new Location("BANGALORE",1000F),
				40);
		assertEquals(new Float(11760), trip.getTotalExpense());
	
	}
	
	@Test
	public void itGivesCorrectTotalExpenseFor_A_Petrol_NonAC_Car_WhenMaxCapacityExcedes() {
		
		Trip trip = new Trip(
				new Car("Swift", FuelType.PETROL, Vehicle.NONAC),
				new Location("PUNE", 0F),
				new Location("MUMBAI",200F),
				7);
		assertEquals(new Float(2400), trip.getTotalExpense());
	
	}
	
	@Test
	public void itGivesCorrectTotalExpenseFor_AN_AC_BUS_WhenMaxCapacityExcedes() {
		
		Trip trip = new Trip(
				new BUS("Tata skyline", Vehicle.AC, 40),
				new Location("MUMBAI", 200F),
				new Location("BANGALORE",1000F),
				45);
		assertEquals(new Float(20760), trip.getTotalExpense());
	
	}
	
	
	@Test
	public void itGivesCorrectTotalExpenseFor_A_Petrol_NonAC_Car_With_Tolls() {
		
		Trip trip = new Trip(
				new Car("Swift", FuelType.PETROL, Vehicle.NONAC),
				new Location("PUNE", 0F),
				new Location("MUMBAI",200F, 100F),
				5);
		assertEquals(new Float(1900), trip.getTotalExpense());
	
	}
	
	@Test
	public void itGivesCorrectTotalExpenseFor_A_SUV_With_Multiple_Tolls() {
		
		Trip trip = new Trip(
				new SUV("Mahindra XUV 500", 7),
				new Location("MUMBAI", 200F, 100F),
				new Location("BANGALORE",1000F, 100F, 150F),
				7);
		assertEquals(new Float(12250), trip.getTotalExpense());
	
	}
	
	@Test
	public void itCalculatesTotalFuelExpenseForA_Petrol_NonAC_Car(){
		Trip trip = new Trip(
				new Car("Swift", FuelType.PETROL, Vehicle.NONAC, 20F),
				new Location("PUNE", 0F),
				new Location("MUMBAI",200F),
				5);
		assertEquals(new Float(1800), trip.getTotalExpense());
		assertEquals(new Float(600), trip.getFuelExpense());
	}
	
	@Test
	public void itCalculatesTotalFuelExpenseForA_Diesel_AC_Car(){
		Trip trip = new Trip(
				new Car("Swift", FuelType.DIESEL, Vehicle.AC, 22F),
				new Location("PUNE", 0F),
				new Location("MUMBAI",200F),
				5);
		assertEquals(new Float(2000), trip.getTotalExpense());
		assertEquals(new Float(800), trip.getFuelExpense());
	}
}
