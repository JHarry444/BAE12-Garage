package com.qa.garage;

import com.qa.garage.vehicle.MotorBike;
import com.qa.garage.vehicle.Submarine;
import com.qa.garage.vehicle.Tank;

public class App {

	public static void main(String[] args) {

		Garage garage = new Garage();

		garage.addVehicle(new MotorBike(2, 200, false));

		System.out.println(garage.removeVehicle(1));

		garage.addVehicle(new Tank(3, 35, 46));
		garage.addVehicle(new Tank(57, 47, 3636));
		garage.addVehicle(new Tank(46, 75, 47));

		garage.addVehicle(new Submarine(0, 600, 6));
		garage.addVehicle(new Submarine(0, 600, 6));
//		garage.removeVehicleByType("Tank");

		System.out.println(garage);
		System.out.println(garage.fix());

		garage.removeVehicleByType(Tank.class);
		System.out.println(garage);

		garage.empty();

		System.out.println(garage);
	}

}
