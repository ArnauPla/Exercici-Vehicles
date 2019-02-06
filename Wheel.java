package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;

		checkDiameter(diameter);
	}

	public boolean equals(Wheel wheel) {
		if (this.brand.equals(wheel.brand) && this.diameter == diameter) {
			return true;
		} else
			return false;
	}

	public void checkDiameter(double diameter) {
		if (diameter < 0.4 || diameter > 4) {
			throw new IllegalArgumentException("El diametre de les rodes ha de ser entre 0.4 i 4");
		}
	}

}