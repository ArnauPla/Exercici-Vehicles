package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		checkPlate(plate);

		this.plate = plate;
		this.brand = brand;
		this.color = color;

	}

	public void checkPlate(String plate) throws Exception {
		if (!plate.matches("[0-9]{4}[a-zA-Z]{2,3}")) {
			throw new Exception("Introdueix la matrícula correctament!");
		}
	}

	public void checkWheel(Wheel wheel) throws Exception {
		if (wheel == null) {
			throw new Exception("La roda no pot ser null.");
		}
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addWheelsAxis(frontWheels);
		addWheelsAxis(backWheels);
	}

	public abstract void addWheelsAxis(List<Wheel> wheels) throws Exception;
}