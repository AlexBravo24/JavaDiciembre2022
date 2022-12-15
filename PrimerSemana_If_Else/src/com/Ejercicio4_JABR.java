package com;

import java.util.Scanner;

public class Ejercicio4_JABR {

	public static void main(String[] args) {
		
		String letra;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa una letra");
		letra=sc.nextLine();
		
		if (letra.equals(letra.toUpperCase())) {
			System.out.println("Es mayúscula");
		}else {
			System.out.println("Es minúscula");
		}
		
	}

}
