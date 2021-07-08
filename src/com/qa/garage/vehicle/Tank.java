package com.qa.garage.vehicle;

public class Tank extends Vehicle {

	private int barrelSize;

	public Tank(int noOfWheels, int engineSize, int barrelSize) {
		super(noOfWheels, engineSize);
		this.barrelSize = barrelSize;
	}

	public int getBarrelSize() {
		return barrelSize;
	}

	public void setBarrelSize(int barrelSize) {
		this.barrelSize = barrelSize;
	}

	@Override
	public float calcBill() {
		float bill = 0.0F;

		bill += this.getEngineSize() * this.getNoOfWheels();

		bill += this.barrelSize * 100;

		return bill;
	}

	@Override
	public String toString() {
		return "Tank [barrelSize=" + barrelSize + ", getId()=" + getId() + ", getNoOfWheels()=" + getNoOfWheels()
				+ ", getEngineSize()=" + getEngineSize() + "]";
	}

}
