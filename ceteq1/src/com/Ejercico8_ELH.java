package com;

import java.util.Scanner;

public class Ejercico8_ELH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r;
		String n;
		
		System.out.println("Por favor ingrese el resultado del dado");
		r = sc.nextInt();
		
		if(r==1) {
			n="Seis";
			System.out.println("El numero en la cara opuesta es " +n);
		}
		
		
	}
	
}
