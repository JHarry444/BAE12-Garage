package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage.solid.Flyable;
import com.qa.garage.solid.Owl;
import com.qa.garage.solid.Plane;
import com.qa.garage.vehicle.MotorBike;
import com.qa.garage.vehicle.Submarine;
import com.qa.garage.vehicle.Tank;
import com.qa.garage.vehicle.Vehicle;

public class App {

	public static void main(String[] args) {

		Integer i = 27; // autoboxing -> java implicitly converts primitives to objects

		if (new ArrayList<>() instanceof List)
			System.out.println("Congrats! It's a List!");

		Garage garage = new Garage();

		Flyable f = new Plane();
		f = new Owl();

		List<Flyable> flappers = new ArrayList<>();
		flappers.add(new Plane());
		flappers.add(new Owl());

		Vehicle v = new Tank(30, 60, 70);
		((Tank) v).getBarrelSize();
		Tank t = new Tank(30, 60, 80);
		t.getBarrelSize();

		if (garage instanceof Garage)
			System.out.println("Surprise! The garage is a Garage!");

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
