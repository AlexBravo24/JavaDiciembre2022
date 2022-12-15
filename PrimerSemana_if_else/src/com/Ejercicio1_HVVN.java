package com;

import java.util.Scanner;

public class Ejercicio1_HVVN {

	public static void main(String[] args) {
		//Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales.
		
		int x, y;
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Ingresa un valor: ");
		x = Sc.nextInt();
		
		System.out.println("Ingresa otro valor: ");
		y = Sc.nextInt();
		
		if (x<y){
			System.out.println("El primer valor es menor: ");
			
		}else if (x==y){
			System.out.println("Los valores son iguales: ");
			}else
			System.out.println("El primer valor es el mayor; ");

	}

}
