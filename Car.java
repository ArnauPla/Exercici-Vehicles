package com.vehicles.project;

import java.util.List;
import java.util.Scanner;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheelsAxis(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception("Han de ser dues rodes");

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception("Les rodes d'un mateix eix han de ser iguals");

		checkWheel(rightWheel);
		checkWheel(leftWheel);
		
		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
}