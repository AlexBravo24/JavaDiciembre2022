package com;

import java.util.Scanner;

public class palindromo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner sc = new Scanner(System.in);
	String palabra;
	String inversa = "";
	char c = 0;
	
		System.out.println("Escribe una palabra:");
		palabra = sc.nextLine();
	
	
	System.out.println(palabra.length());
	System.out.println(palabra.charAt(c));
	for(int i = palabra.length()-1;i>=0;i--) {
		c= palabra.charAt(i);
		inversa = inversa + String.valueOf(c);
		System.out.println(inversa);
	}
	
	if(inversa.equalsIgnoreCase(palabra)==true) {
		System.out.println("La palabra es palindromo");
	}else {
		System.out.println("La palabra No es un palindromo");
	}
	
	}
	
	
}
