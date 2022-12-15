package com;

import java.util.Scanner;

public class Ejercicio12_JABR {

	public static void main(String[] args) {
		/*
		 * Construir un programa que calcule el índice de masa corporal
		 *  de una persona (IMC = peso [kg] / altura2 [m]) e indique 
		 *  el estado en el que se encuentra esa persona en función del 
		 *  valor de IMC
		 */
		
		double imc;
		double peso;
		double altura;
				
		Scanner lector=new Scanner (System.in);
		System.out.println("Introduzca su peso en Kg");
		peso=lector.nextDouble();
		System.out.println("Introduzca su altura en m");
		altura=lector.nextDouble();
		imc=peso/(altura*altura);
		System.out.println("Su IMC es ");
		System.out.printf("%.3f", imc);
		if (imc<16) {
			System.out.println("Criterio de ingreso en hospital");
		}else if (imc>=16 && imc<=18) {
			System.out.println("Infrapeso");
		}else if (imc>17 && imc<=18) {
			System.out.println("Bajo peso");
		}else if (imc>18 && imc<=25) {
			System.out.println("Peso normal o saludable");
		}else if (imc>25 && imc<=30) {
			System.out.println("Obesidad grado I");
		}else if (imc>30 && imc<=35) {
			System.out.println("Obesidad grado II");
		}else if (imc>35 && imc<=40) {
			System.out.println("Obesidad grado III");
		}else if (imc>40) {
			System.out.println("Obesidad Mórbida grado IV");
		
		}

	}
}


