package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		checkDiameter(diameter);
		
		this.brand = brand;
		this.diameter = diameter;
	}

	public boolean equals(Wheel wheel) {
			return this.brand.equals(wheel.brand) && this.diameter == diameter;
	}

	public void checkDiameter(double diameter) throws Exception {
		if (diameter < 0.4 || diameter > 4) {
			throw new Exception("El diametre de les rodes ha de ser entre 0.4 i 4");
		}
	}
	
}