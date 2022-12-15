package com;

import java.util.Scanner;

public class ArraysEjercicio1_HVVN {

	public static void main(String[] args) {
		// Hacer un arreglo de 10 nombres, los cuales puedan introducirlos por teclado 
		//y que después les imprima todos los nombres que ingresaron en el arreglo.
		
		String [] nombres = new String [10];
		Scanner Scan = new Scanner(System.in);
		
		for (int i=0;i<nombres.length;i++) {
			System.out.println("introduzca los nombres");
			nombres[i]=Scan.next();
			
			
		}
		for (int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}

	}

}
