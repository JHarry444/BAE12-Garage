package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage.vehicle.MotorBike;
import com.qa.garage.vehicle.Submarine;
import com.qa.garage.vehicle.Tank;
import com.qa.garage.vehicle.Vehicle;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicles.add(vehicle);
	}

	public boolean removeVehicle(int id) {
		for (Vehicle v : this.vehicles) {
			if (v.getId() == id) {
				return this.vehicles.remove(v);
			}
		}
		return false;
	}

	public boolean removeVehicleByType(String type) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();

		for (Vehicle v : this.vehicles) {
			if (v.getClass().getSimpleName().equals(type)) {
				toRemove.add(v);
			}
		}

		return this.vehicles.removeAll(toRemove);
	}

	public boolean removeVehicleByType(Class<?> clazz) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();

		for (Vehicle v : this.vehicles) {
			if (v.getClass() == clazz) {
				toRemove.add(v);
			}
		}

		return this.vehicles.removeAll(toRemove);
	}

	public float fix() {
		float bill = 0.0F;

		for (Vehicle v : this.vehicles) {
			bill += v.calcBill();
		}

		return bill;
	}

	public float fixLong() {
		float bill = 0.0F;

		for (Vehicle v : this.vehicles) {
			if (v instanceof Tank) {
				bill += v.getEngineSize() * v.getNoOfWheels();

				bill += ((Tank) v).getBarrelSize() * 100;
			} else if (v instanceof Submarine) {
				bill += v.getEngineSize() * v.getNoOfWheels();

				bill += ((Submarine) v).getTorpedoes() * 50;
			} else if (v instanceof MotorBike) {

			}
		}

		return bill;
	}

	public boolean empty() {
		this.vehicles.clear();
		return this.vehicles.size() == 0;
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}

}
