package com;

import java.util.Scanner;

public class Estructura2_JABR {

	public static void main(String[] args) {
		
		/*2.Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado
		 * hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		 */
		
		int tabla;
		int incremento;
		
		Scanner s=new Scanner (System.in);
		System.out.println("Introduce el número del que deseas la tabla");
		tabla=s.nextInt();
		System.out.println("Introduce el numero hasta el que deseas multiplicar dicha tabla");
		incremento=s.nextInt();
		
		for (int i = 1;i<=incremento;i++) {
			System.out.println(tabla + " x " + i + " = " +tabla*i);
		}

	}
}
