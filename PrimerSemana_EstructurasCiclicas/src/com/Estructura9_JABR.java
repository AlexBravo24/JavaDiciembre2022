package com;

import java.util.Scanner;

public class Estructura9_JABR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*9. Programa Java que lea dos números y muestre los números pares entre ellos
		 * 
		 */
		
		int num1;
		int num2;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el numero 1: ");
		num1 = lector.nextInt();
		System.out.println("Ingresa el numero 2: ");
		num2 = lector.nextInt();
	
		if (num1<num2) {
			for (int i = num1;i<=num2;i++) {
				if (i % 2==0){
					System.out.println(i);	
				}
					
		}
		}
			else {
			for (int i = num2;i<=num1;i++) {
				if (i % 2==0){
					System.out.println(i);	
				}	
		}
	}
	}
}