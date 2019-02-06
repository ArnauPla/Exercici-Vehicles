package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Car cotxe = enterCar();		
		
		List<Wheel> rodesDavanteres = enterWheelAxis("davantera");	
		List<Wheel> rodesTraseres = enterWheelAxis("trasera");	
		
		cotxe.addWheels(rodesDavanteres, rodesTraseres);
		
	}
	
	public static List<Wheel> enterWheelAxis(String eix) {
		
		Wheel primeraRoda = enterWheel("primera", eix);
		
		Wheel segonaRoda = enterWheel("segona", eix);
		
		List<Wheel> rodes = new ArrayList<Wheel>();
		rodes.add(primeraRoda);
		rodes.add(segonaRoda);
		
		return rodes;
	}
	
	public static Wheel enterWheel(String ordre, String eix) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quina és la marca de la " + ordre + " roda " + eix + "?");
		String marcaRoda = entrada.nextLine();
		
		System.out.println("Quin és el diàmetre de la " + ordre + " roda " + eix + "?");
		double diametreRoda = Double.parseDouble(entrada.nextLine());

		Wheel roda = new Wheel(marcaRoda, diametreRoda);
		
		return roda;
		
	}
	
	public static Car enterCar() throws Exception {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Matricula? (Ha de ser de la forma: 0000AA o 0000AAA)");
		String matricula = entrada.nextLine();
	
		System.out.println("Marca?");
		String marca = entrada.nextLine();
	
		System.out.println("Color?");
		String color = entrada.nextLine();
		
		Car cotxe = new Car(matricula, marca, color);
		
		return cotxe;
	}

}