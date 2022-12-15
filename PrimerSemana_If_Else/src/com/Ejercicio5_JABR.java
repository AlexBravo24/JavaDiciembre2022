package com;

import java.util.Scanner;

public class Ejercicio5_JABR {

	public static void main(String[] args) {
		
		int nota;
		int edad;
		String sexo="M";
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingresa una nota");
		nota=lector.nextInt();
		System.out.println("Ingresa edad");
		edad=lector.nextInt();
		lector.nextLine();
		System.out.println("Ingresa sexo M/F");
		sexo=lector.nextLine();
		if (nota>=5 && edad>=18 && sexo.equals("M")) {
			System.out.println("Posible");
		}else if(nota>=5 && edad>=18 && sexo.equals("F")){
			System.out.println("Aceptada");
		}else {
			System.out.println("No Aceptada");
		}
				
	}

}