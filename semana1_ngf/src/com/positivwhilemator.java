package com;

import java.util.Scanner;

public class positivwhilemator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, mayor=0;
		
	Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero y detenga con cero:");
		
		i = sc.nextInt();
		while(i!=0) {
			
			if(i>mayor) {
				mayor=i;
		}
		 System.out.println("Ingrese un numero o cero si desea salir");
		 i = sc.nextInt();
	}
	System.out.println("El numero mayor ingresado es: "+mayor);	
	
}
}