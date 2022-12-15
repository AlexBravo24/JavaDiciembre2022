package com;

import java.util.Scanner;

public class Ejercicio4_Yiram {
	
	public static void main(String[] args) {
		
		String z;
		Scanner lector = new Scanner(System.in);
		boolean v;
		
		System.out.println("Ingresa una cadena");
		z = lector.nextLine();
		v = z.equals(z.toLowerCase());
		
		if(v == false)
		{
			System.out.println("Es mayuscula");
		}
		else {
			System.out.println("Es minuscula");
		}
		

	}
		
}




