package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		String [] nombre = new String [5];
		Scanner sc = new Scanner(System.in);
		
		
//		char[] caracter = {'a','b','c','d','e','f','g','h','i','j'};  // Array de 10 caracteres que los imprime
//		for (int i=0; i<caracter.length; i++) {
//			System.out.println("indice" +i+ "=" +caracter[i]);
//			
//		}
		
		
//		String [] nombres = {"hugo","daniel","roberto","ximena","adriana","alejandro","laura","pedro","ana","sofia"};
//		for (int i=0; i<nombres.length;i++) {
//			System.out.println("indice" +i+ "="+nombres[i]);
//		}
//		
		for ( int i=0;i<nombre.length;i++) {
		System.out.println("Por favor ingrese un nombre");
		nombre[i]= sc.next();
//		System.out.println("El nombre "+nombre[i]+" está en la posicion "+i);
		}
		
		for ( int i=0;i<nombre.length;i++) {
			System.out.println("El nombre "+nombre[i]+" está en la posicion "+i);
		
		
		}
		
		
	}
	
}
