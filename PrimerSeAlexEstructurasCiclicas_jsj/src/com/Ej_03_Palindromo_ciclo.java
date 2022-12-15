package com;

import java.util.Scanner;

public class Ej_03_Palindromo_ciclo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String s;
//		String inversa="";
//		char c;
//		
//		Scanner sc =new Scanner(System.in);
//		System.out.println(" Ingrese la palabra ");
//		s=sc.nextLine();
//		
//		for(int i=s.length()-1; i>=0; i--) {
//			
//			c =s.charAt(i);
//			inversa =inversa + String.valueOf(c);
//			
//		}
//		System.out.println(inversa);
//		
//		if(inversa.equalsIgnoreCase(s)==true) {
//			System.out.println("La palabra es palindromo");
//		}else {
//			System.out.println("La palabra no es in palindromo");
//		}
//		
//			Scanner sc = new Scanner(System.in);
//			String palabra;
//			String inversa = "";
//			char c = 0;
//			
//				System.out.println("Escribe una palabra:");
//				palabra = sc.nextLine();
//			
//			
//			System.out.println(palabra.length());
//			System.out.println(palabra.charAt(c));
//			for(int i = palabra.length()-1;i>=0;i--) {
//				c= palabra.charAt(i);
//				inversa = inversa + String.valueOf(c);
//				System.out.println(inversa);
//			}
//			
//			if(inversa.equalsIgnoreCase(palabra)==true) {
//				System.out.println("La palabra es palindromo");
//			}else {
//				System.out.println("La palabra No es un palindromo");
//			}
			
			// microservicio donde nos muestra cuantos un caracter especifico
//		String nombre="Alejandro";
//		int ultima_letra;
//		
//		ultima_letra=nombre.length();
//		System.out.println(ultima_letra);
//		
//		System.out.println("Y la primera letra es la " + nombre.charAt(nombre.length()-1));
//		
		
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese la palabra");
		String original=entrada.nextLine();
		String reversa="";
		
		
		for (int i=original.length()-1;i>=0; i--) {
			reversa =reversa + original.charAt(i);
		}
		System.out.println("reversa = " + reversa.replace(" ", ""));
		if(original.replace("", "").equalsIgnoreCase(reversa.replace(" ", "" ))) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("no es palindromo");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
