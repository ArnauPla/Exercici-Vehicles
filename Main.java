package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		String tipusVehicle = "";
		generateVehicle(tipusVehicle);
	}

	public static void generateVehicle(String tipusVehicle) throws Exception {
		Scanner entrada = new Scanner(System.in);
		while (!tipusVehicle.equals("cotxe") && !tipusVehicle.equals("moto")) {
			System.out.println("Quin vehicle és? Escriu 'cotxe' o 'moto'.");
			tipusVehicle = entrada.nextLine();
		}
		Vehicle vehicle = enterInfo(tipusVehicle);
		addWheels(vehicle);
	}

	public static Vehicle enterInfo(String tipusVehicle) throws Exception {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Matricula? (Ha de ser de la forma: 0000AA o 0000AAA)");
		String matricula = entrada.nextLine();

		System.out.println("Marca?");
		String marca = entrada.nextLine();

		System.out.println("Color?");
		String color = entrada.nextLine();

		if (tipusVehicle.equals("cotxe")) {
			return new Car(matricula, marca, color);
		} else {
			return new Bike(matricula, marca, color);
		}

	}

	public static void addWheels(Vehicle vehicle) throws Exception {
		List<Wheel> rodaDavantera = askWheelAxis(vehicle, "davantera");
		List<Wheel> rodaTrasera = askWheelAxis(vehicle, "posterior");

		vehicle.addWheels(rodaDavantera, rodaTrasera);
	}

	public static List<Wheel> askWheelAxis(Vehicle vehicle, String eix) throws Exception {

		List<Wheel> rodes = new ArrayList<Wheel>();

		if (vehicle instanceof Car) {
			Wheel primeraRoda = askWheel(" primera", eix);

			Wheel segonaRoda = askWheel(" segona", eix);

			rodes.add(primeraRoda);
			rodes.add(segonaRoda);

		} else {
			Wheel roda = askWheel("", eix);
			rodes.add(roda);
		}
		return rodes;

	}

	public static Wheel askWheel(String ordre, String eix) throws Exception {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quina és la marca de la" + ordre + " roda " + eix + "?");
		String marcaRoda = entrada.nextLine();

		System.out.println("Quin és el diàmetre de la" + ordre + " roda " + eix + "?");
		double diametreRoda = Double.parseDouble(entrada.nextLine());

		Wheel roda = new Wheel(marcaRoda, diametreRoda);

		return roda;
	}
}