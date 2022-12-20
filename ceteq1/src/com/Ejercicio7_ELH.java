package com;

import java.util.Scanner;

public class Ejercicio7_ELH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnos;
		float costo, costoA;
		
		System.out.println("Para de terminar el costo de viaje por favor ingrese la cantidad de alumnos que viajaran");
		alumnos = sc.nextInt();
		
		if(alumnos >=100 ) {
			costoA= alumnos * 65;
			costo = 65;
			System.out.println("El costo por alumno es de "+costoA);
			System.out.println("EL costo total a cubrir es de "+costo);
		}else if(alumnos<=99 && alumnos >=50) {
			costoA = alumnos*75;
			costo = 75;
			System.out.println("El costo por alumno es de "+costoA);
			System.out.println("EL costo total a cubrir es de "+costo);
		}else if(alumnos >=30 && alumnos <=49) {
			costoA = alumnos*95;
			costo = 95;
			System.out.println("El costo por alumno es de "+costoA);
			System.out.println("EL costo total a cubrir es de "+costo);
		}else if(alumnos<30) {
			System.out.println("El costo por renta de autobus es de $4,000 ");
		
		
		}
		
	}
	
	
	
}
