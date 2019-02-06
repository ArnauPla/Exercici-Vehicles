package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
		
		checkPlate(plate);
	}
	
	public void checkPlate(String plate) throws Exception {
		if(!plate.matches("[0-9]{4}[a-zA-Z]{2,3}")){
			throw new Exception("Introdueix la matrícula correctament!");
		}
	}
}