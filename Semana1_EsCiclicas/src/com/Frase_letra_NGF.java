package com;

import java.util.Scanner;

public class Frase_letra_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra
//		dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.
	
		Scanner sc =new Scanner (System.in);
		
	String frase;
	String letra;
	int contador = 0;
	
		System.out.println("Escribe la frase:");
		frase =sc.nextLine();
		System.out.println("Escribe la Letra a buscar:");
		letra =sc.nextLine();
		
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i)==letra.charAt(0)) {
				contador ++;
			  							
			}
		}
		if (contador!=0) {
			System.out.println("La letra" +letra.charAt(0)+"se repite" +contador+"veces");
		}else
			System.out.println("Caracter NO encontrado ");
		
		}
		
}
