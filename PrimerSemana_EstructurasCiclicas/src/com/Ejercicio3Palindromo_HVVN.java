package com;

import java.util.Scanner;

public class Ejercicio3Palindromo_HVVN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("");
		String original=entrada.nextLine();
		String reversa="";
		
		for (int i=original.length()-1;i>=0;i--) {
			reversa = reversa + original.charAt(i);
			
		}
		System.out.println("Reversa" + reversa.replace(" ", ""));
		
		if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo ");
		}else
			System.out.println("No es palindromo");


	}

}
