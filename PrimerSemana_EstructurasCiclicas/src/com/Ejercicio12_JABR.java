package com;

import java.util.Scanner;

public class Ejercicio12_JABR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		int promedio=0;
		int edad=0;
		int totaledad=0;
		
		Scanner lector = new Scanner(System.in);
		
		while(promedio<25) {
			System.out.println("Ingresa una edad: ");
			edad = lector.nextInt();
			num=num+1;
			totaledad = totaledad +edad;
			promedio = totaledad/num;
			System.out.println("El promedio es: "+promedio);
			
		}
	}
		
		

}