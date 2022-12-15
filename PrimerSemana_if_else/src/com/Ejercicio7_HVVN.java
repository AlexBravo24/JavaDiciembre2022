package com;

import java.util.Scanner;

public class Ejercicio7_HVVN {

	public static void main(String[] args) {
//		//El director de una escuela está organizando un viaje de estudios 
//		y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar 
//		a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//			Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//			* De 50 a 99 alumnos, el costo es de 70 euros.
//			* De 30 a 49 alumnos, el costo es de 95 euros.
//			* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
//			alumnos.
//			Realiza un algoritmo que permita determinar el pago a la compañía de autobuses 
//		y lo que debe pagar cada alumno por el viaje.
		
		int NumAlum, costo; 
		int RentBus;
		Scanner Scan = new Scanner(System.in);

		System.out.println("Digite el numero de Alumnos que asistiran al viaje ");
		NumAlum = Scan.nextInt();
		
		if ((NumAlum  <=99)&&(NumAlum >50)) {
			System.out.println("El costo por alumno es 70 Euros y se debe pagar por el autobus "+ NumAlum*70 + "Euros");
		}else if ((NumAlum <=49)&&(NumAlum >= 30)) {
			System.out.println("El costo por alumno es de 95 Euros y se debe pagar por el autobus "+NumAlum*95 +"Euros");
			
		} else  {
			System.out.println("El Costo por Alumno es " +4000/NumAlum+"  Euros y el pago al autobus es de 4000 Euros ");
		}
	}

}
