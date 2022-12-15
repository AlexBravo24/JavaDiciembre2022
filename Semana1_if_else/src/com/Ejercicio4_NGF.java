package com;

import java.util.Scanner;

public class Ejercicio4_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula

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


