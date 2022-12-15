package com;

import java.util.Scanner;

public class Estructura3_JABR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3. Realiza un programa para determinar si un String es palíndromo
		 */
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa una palabra");
		String original=entrada.nextLine();
		String reversa ="";
		
		//iterando al reves para armar la reversa
		for (int i=original.length()-1;i>=0;i--) {
			reversa = reversa + original.charAt(i);
		}
		
		System.out.println("reversa: " + reversa.replace(" ",""));
		if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))){
			System.out.println("Es palindromo");
			
		}else
			System.out.println("No es palindromo");

	}

}
