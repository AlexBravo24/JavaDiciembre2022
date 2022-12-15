package com;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio7_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
pagar cada alumno por el viaje.*/

		double pagoautobus;
		double pasajeros;
		double mpasajeros;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero de pasajeros: ");
		pasajeros = sc.nextDouble();
		
		
		if (pasajeros>=100) {
			System.out.println("El costo del pasaje por persona es de 65 Euros");
			pagoautobus = pasajeros * 65;
			System.out.println("El pago al autobus es de: " +pagoautobus );
			
		} else if ((pasajeros>=50) && (pasajeros<=99)) {
			System.out.println("El costo del pasaje por persona es de 70 Euros");
			pagoautobus = pasajeros * 70;
			System.out.println("El pago al autobus es de: " +pagoautobus);
			
		} else if ((pasajeros>=30) && (pasajeros<=49)) {
			System.out.println("El costo del pasaje por persona es de 95 Euros");
			pagoautobus = pasajeros * 95;
			System.out.println("El pago al autobus es de: " +pagoautobus);
			
		} else if (pasajeros<=30) {
			mpasajeros = 4000/pasajeros;
			System.out.println("El pago al autobus es de: 4000 Euros ");
			System.out.println("El pago por persona es de: " );
			System.out.printf("%.2f",mpasajeros);
			
//			DecimalFormat df = new DecimalFormat("#.##");
//			System.out.print(df.format(mpasajeros));
			
					
	}
	}
}
