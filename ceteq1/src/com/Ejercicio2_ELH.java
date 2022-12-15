package com;

import java.util.Scanner;

public class Ejercicio2_ELH {

	public static void main(String[] args) {
		//Realiza un programa que pida un numero por teclado y nos
		//indique si es numero par o impar 
		
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite un numero");
		x=sc.nextInt();
		
		if(x%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		
		
	}
	
	
}
