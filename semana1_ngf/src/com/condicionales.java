package com;

import java.util.Scanner;

public class condicionales {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	float n1,n2,r;
		System.out.println("Ingresa n2:");
	n2 = sc.nextFloat();
	
	n2 = n2%2;
	
	if (n2 == 0) {
		System.out.println("El numero es par");
	}
	else
	{
		System.out.println("El numero es impar");
	}
	
	Scanner entrada = new Scanner(System.in);
	int n;
	
	System.out.println("Ingresa un numero:");
	n = entrada.nextInt();
	
	if((n%2==0)&&(n%7==0)) {
	System.out.println("El numero es multiplo de 2 y 7");
	
	}else if (n%7==0) {
	System.out.println("El numero es multiplo de 7");
	
	}else if (n%2==0) {
	System.out.println("El numero es multiplo de 2");
	
	}else {
	System.out.println("El numero no es multiplo de 2 ni de 7");
	
	}
	}
	} 



	

	
	
	
	


			
	
	