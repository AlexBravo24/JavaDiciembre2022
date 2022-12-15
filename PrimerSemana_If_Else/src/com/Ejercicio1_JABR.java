package com;

import java.util.Scanner;

public class Ejercicio1_JABR {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Ingresa un valor");
		x=sc.nextInt();
		
		System.out.println("Ingresa otro valor");
		y=sc.nextInt();
		
		if(x<y) {
			System.out.println("El primer valor es menor");
		}else if (x==y) {
			System.out.println("Los valores son iguales");
		}else
			System.out.println("El primer valor es mayor");
	}
}
