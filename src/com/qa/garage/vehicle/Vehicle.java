package com.qa.garage.vehicle;

public abstract class Vehicle {

	private static int count = 0;

	private int id;

	private int noOfWheels;

	private int engineSize;

	public Vehicle() {
		super();
		this.id = ++count;
		// increase the count by 1
		// sets id = count
	}

	public Vehicle(int noOfWheels, int engineSize) {
		super();
		this.noOfWheels = noOfWheels;
		this.engineSize = engineSize;
		this.id = ++count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", noOfWheels=" + noOfWheels + ", engineSize=" + engineSize + "]";
	}

	public abstract float calcBill();

}
