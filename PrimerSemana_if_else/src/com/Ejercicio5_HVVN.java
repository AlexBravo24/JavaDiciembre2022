package com;

import java.util.Scanner;

public class Ejercicio5_HVVN {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud 
		//en base a los siguientes parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		int nota, edad;
		String sexo;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Digite su nota: ");
		nota = Sc.nextInt();
		System.out.println("Digite su edad: ");
		edad = Sc.nextInt();
		System.out.println("Digite su sexo: ");
		sexo = Sc.next();
		
		if ((nota>=5)&&(edad>=18)&&(sexo.equals("M"))){
			System.out.println("STATUS : POSIBLE ");
		}else if ((nota>=5)&&(edad>=18)&&(sexo.equals("F"))) {
			System.out.println("STATUS : ACEPTADA");
		}else {
			System.out.println("STATUS : NO ACEPTADO/A");
			
			

	}

	}
	
}
