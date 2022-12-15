package com;

import java.util.Scanner;

public class tabladoce {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc = new Scanner(System.in);  
		int n1 = 12;
		int n2;
		float r;
		
	do {
		System.out.println("Ingresa un numero para ser multiplicado por 12: ");
		System.out.println("o teclea cero para finalizar:");
		n2 = sc.nextInt();
		
		r=(n1*n2);
				
		System.out.println("El resultado es:"+r);
		
	}while (n2!=0);
	System.out.println("ha terminado usted tecleo cero");
	}
		
		}
		

