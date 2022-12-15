package com;

import java.util.Scanner;

public class Ejercicio3_HVVN {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y 
		//muestre el resultado de su división. Si el
		//segundo número es 0, debe mostrar un mensaje de error
		
		Scanner Sc = new Scanner(System.in);
		
		double x, y;
		double resultado;
		
		System.out.println("Ingrese el primer numero: ");
		x = Sc.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		y = Sc.nextDouble();
		
		if (y !=0) {
			resultado = x/y;
			System.out.println("El resultado de la division es " + resultado);		
		}else {
			System.out.println("Synthax Error: ");
		}

	}

}
