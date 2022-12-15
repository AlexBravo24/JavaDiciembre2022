package com;

import java.util.Scanner;

public class Ejercicio4_HVVN {

	public static void main(String[] args) {
		//Realiza un programa que lea una cadena por teclado 
		// y compruebe si es una letra mayúscula.
		
		String cadena, s1;
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Digite una palabra: ");
		cadena = Sc.nextLine();
		s1 = cadena.toLowerCase();
		
		if (cadena.equals(s1)== false) {
			System.out.println("Contiene Mayusculas");
			
		}else 
			System.out.println("No contiene Mayusculas");

	}

}
