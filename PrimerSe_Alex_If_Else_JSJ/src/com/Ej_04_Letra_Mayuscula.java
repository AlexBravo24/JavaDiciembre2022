package com;

import java.util.Scanner;

public class Ej_04_Letra_Mayuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner letra = new Scanner(System.in);
		String s, s1;
		
		System.out.println("Ingresa una palabra");
		s=letra.next();
		s1 = s.toLowerCase();
		
		if(s.equals(s1)==false) {
			System.out.println("Contiene Mayusculas");
		}else
			System.out.println("No contiene Mayusculas");
	}

}
