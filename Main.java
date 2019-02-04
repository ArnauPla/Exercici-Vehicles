package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Matricula? (Ha de ser de la forma: 0000AA o 0000AAA)");
		String matricula = entrada.nextLine();
	
		System.out.println("Marca?");
		String marca = entrada.nextLine();
	
		System.out.println("Color?");
		String color = entrada.nextLine();
		
		Car cotxe = new Car(matricula, marca, color);
		
		
		System.out.println("Marca rodes traseres?");
		String marcaTrasera = entrada.nextLine();
		
		System.out.println("Diametre rodes traseres?");
		double diametreTrasera = Double.parseDouble(entrada.nextLine());

		Wheel trasera = new Wheel(marcaTrasera, diametreTrasera);
		
		List<Wheel> rodesTraseres = new ArrayList<Wheel>();
		rodesTraseres.add(trasera);
		rodesTraseres.add(trasera);
		
		
		System.out.println("Marca rodes davanteres?");
		String marcaDavantera = entrada.nextLine();
		
		System.out.println("Diametre rodes davanteres?");
		double diametreDavantera = Double.parseDouble(entrada.nextLine());

		Wheel davantera = new Wheel(marcaDavantera, diametreDavantera);
		
		List<Wheel> rodesDavanteres = new ArrayList<Wheel>();
		rodesDavanteres.add(davantera);
		rodesDavanteres.add(davantera);
		
		cotxe.addWheels(rodesTraseres, rodesDavanteres);
	}

}