package com;

import java.util.Scanner;

public class Ejercicio14_JABR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*14. Un obrero necesita calcular su salario semanal, 
		 * el cual se obtiene de la siguiente manera: 
		 * Si trabaja 40 horas o menos se le paga $16 por hora. 
		 * Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 
		 * 40 horas y $20 por cada hora extra.
		 */
		
		int numHora;
		int pHora=16;
		int hExtra=20;
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el número de horas a calcular");
		numHora=lector.nextInt();
		if (numHora<=40) {
			System.out.println("El total por " + numHora + " es " + (numHora*pHora));
		}else if (numHora>40) {
			System.out.println("El total por " + numHora + " es " + ((40*pHora)+((numHora-40)*hExtra)));
			
		}
		
		
	}

}
