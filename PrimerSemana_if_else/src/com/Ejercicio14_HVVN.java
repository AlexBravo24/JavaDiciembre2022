package com;

import java.util.Scanner;

public class Ejercicio14_HVVN {

	public static void main(String[] args) {
		// . Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente
//		manera: Si trabaja 40 horas o menos se le paga $16 por hora. 
//		Si trabaja más de 40 horas se le paga $16 por cada una de las
//		primeras 40 horas y $20 por cada hora extra.
		
		int horas, salario, extras;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Digite las horas trabajadas esta semana ");
		horas = Scan.nextInt();
		
		if (horas<=40) {
			System.out.println("El salario semanal es de " + horas*16);
		}else if (horas>40) {
			extras = (horas-40)*20;
			salario = (40)*16;
			System.out.println("El salario semana es de " + (salario+extras));
		}else {
			System.out.println("Error ");
		}

	}

}
