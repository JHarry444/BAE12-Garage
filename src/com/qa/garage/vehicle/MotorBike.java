package com.qa.garage.vehicle;

public class MotorBike extends Vehicle {

	private boolean sideCar;

	public MotorBike(int noOfWheels, int engineSize, boolean sideCar) {
		super(noOfWheels, engineSize);
		this.sideCar = sideCar;
	}

	public MotorBike() {
		super();
	}

	public boolean isSideCar() {
		return sideCar;
	}

	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}

	@Override
	public float calcBill() {
		float bill = 0.0F;

		bill += this.getEngineSize() * this.getNoOfWheels();
		if (this.isSideCar() == true) {
			bill += 50;
		}

		return bill;
	}

	@Override
	public String toString() {
		return "MotorBike [sideCar=" + sideCar + ", getId()=" + getId() + ", getNoOfWheels()=" + getNoOfWheels()
				+ ", getEngineSize()=" + getEngineSize() + "]";
	}

}
