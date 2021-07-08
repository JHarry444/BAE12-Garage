package com.qa.garage.vehicle;

public class Submarine extends Vehicle {

	private int torpedoes;

	public Submarine(int noOfWheels, int engineSize, int torpedoes) {
		super(noOfWheels, engineSize);
		this.torpedoes = torpedoes;
	}

	public int getTorpedoes() {
		return torpedoes;
	}

	public void setTorpedoes(int torpedoes) {
		this.torpedoes = torpedoes;
	}

	@Override
	public float calcBill() {
		float bill = 0.0F;

		bill += this.getEngineSize() * this.getNoOfWheels();

		bill += this.torpedoes * 50;

		return bill;
	}

	@Override
	public String toString() {
		return "Submarine [torpedoes=" + torpedoes + ", getId()=" + getId() + ", getNoOfWheels()=" + getNoOfWheels()
				+ ", getEngineSize()=" + getEngineSize() + "]";
	}

}
