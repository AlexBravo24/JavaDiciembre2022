package com;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. 
		//Deberá retornar como resultado cuántas veces existe esa letra
		//dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.
		
		Scanner Scan = new Scanner(System.in);
		String frase;
		String letra;
		int contador = 0;
		
		
		System.out.println("Digite una Frase ");
		frase = Scan.nextLine();
		System.out.println("Digite el caracter a comparar ");
		letra = Scan.nextLine() ;
		
		for(int i=0;i<frase.length();i++) {
			if (frase.charAt(i)==letra.charAt(0)) {
				contador ++;
			}
		}
		if (contador!=0) {
			System.out.println("El caracter "+letra.charAt(0)+"se repite " +contador+"veces");
		}else
			System.out.println("Caracter no encontrado ");

	}

}
