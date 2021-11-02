package com.qa.garage.solid;

import com.qa.garage.vehicle.Vehicle;

public class Plane extends Vehicle implements Flyable, Bombable {

	public Plane() {
		super();
	}

	public Plane(int noOfWheels, int engineSize) {
		super(noOfWheels, engineSize);
	}

	@Override
	public float calcBill() {
		return 47;
	}

	@Override
	public void fly() {
		System.out.println("whoosh?");

	}

	@Override
	public void dropBombs() {
		System.out.println("Look out below!");
	}

}
