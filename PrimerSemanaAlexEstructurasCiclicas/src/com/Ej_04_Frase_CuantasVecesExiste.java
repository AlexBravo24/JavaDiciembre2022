package com;

import java.util.Scanner;

public class Ej_04_Frase_CuantasVecesExiste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String frase;
		String letra;
		int contador=0;
		
		System.out.println("Ingrese una palabra");
		frase= sc.nextLine();
		System.out.println("Digite un caracter a comparar");
		letra=sc.nextLine();
	
		for (int i =0; i<frase.length();i++) {
			if(frase.charAt(i)==letra.charAt(0)) {
				contador++;
			}
		}
		
		if(contador!=0) {
			System.out.println("El caracter " + letra.charAt(0) + " Se repite " + contador +"veces");
		}else {
			System.out.println("Caracter no encontrador");
		}
	}

}
