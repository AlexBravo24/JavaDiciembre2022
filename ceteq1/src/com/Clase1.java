package com;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {
		int x, y;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese un valor");
		x=sc.nextInt();
		
		System.out.println("Ingrese un segundo valor");
		y=sc.nextInt();
		
		if(x<y) {
			System.out.println("El primer valor es menor");
		}else if(x==y) {
			System.out.println("Los valores son iguales");
		}else {
			System.out.println("El primer valor es mayor");
		}
		
	}
	
	
}
