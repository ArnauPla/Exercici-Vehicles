package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	
	public boolean equals(Wheel wheel) {
		if(this.brand.equals(wheel.brand) && this.diameter == diameter) {
			return true;
		} else
			return false;
	}
}