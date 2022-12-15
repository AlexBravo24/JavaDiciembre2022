package com;

import java.util.Scanner;

public class Ejercicio2_HVVN {

	public static void main(String[] args) {
		// .Realiza un programa que pida un número por teclado 
		//y nos indique si es par o impar.
		
		int x;
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Digite un numero: ");
		x = Sc.nextInt();
		
		if(x%2==0) {
			System.out.println("El numero es par: ");
		}else
			System.out.println("El numero es impar: ");
		

	}

}
