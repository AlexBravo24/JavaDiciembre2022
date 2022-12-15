package com;

import java.util.Scanner;

public class Ejercicio11_HVVN {

	public static void main(String[] args) {
//		Una compañía de transporte internacional tiene servicio en algunos países de 
//		América del Norte, América Central, América del Sur, Europa y Asia. 
//		El costo por servicio de transporte se basa en el peso del paquete y
//		la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		
		int peso, zona;
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Digite el peso del paquete a enviar: ");
		peso = Scan.nextInt();
		System.out.println("Digite la zona de envio ");
		zona = Scan.nextInt();
		
		if ((peso<=5)&&(zona == 1)) {
			System.out.println("El costo por el envio es "+peso*24+ "Euros" );
		}else if ((peso<=5)&&(zona == 2)) {
			System.out.println("El costo por el envio es "+peso*20+"Euros");
		}else if ((peso<=5)&&(zona == 3)) {
			System.out.println("El costo por el envio es "+peso*21+"Euros");
	}else if ((peso<=5)&&(zona == 4)) {
		System.out.println("El costo por el envio es "+peso*10+"Euros");
				
	}else if((peso<=5)&&(zona == 5)) {
		System.out.println("El costo por el envio es "+peso*18+"Euros");
	}else {
		System.out.println("Datos incorrectos Exceso de peso permitido");
	}
	}
}