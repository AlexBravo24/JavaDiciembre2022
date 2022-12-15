package com;

import java.util.Scanner;

public class Estructura10_JABR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0 ;
		int num = 0 ;
		int sumP = 0 ;
		int sumImp = 0 ;
		
		Scanner lector = new Scanner (System.in);
		
		while (contador<20) {
		
		System.out.println("Ingresa un número");
		num = lector.nextInt();
		
		if (num < 0) { 
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
			sumP = sumP + num;
		}
		
		if (num%2 == 0) {
			System.out.println("es par");
		} else {
			System.out.println("impar");
			sumImp=sumImp + num;
		}
		
		contador++;
		
		}
		System.out.println(" ");
		System.out.println("la suma de los positivo es:  " + sumP);
		System.out.println("la suma de los impares es:  " + sumImp);
	}

		
		
	}
