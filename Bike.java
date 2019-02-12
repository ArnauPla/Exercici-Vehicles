package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheelsAxis(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception("Ha de ser una roda!");

		Wheel wheel = wheels.get(0);

		checkWheel(wheel);

		this.wheels.add(wheel);
	}
}