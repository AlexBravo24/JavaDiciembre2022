package com;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String nombre="Alejandro";
//		int ultima_letra;
//		
//		ultima_letra=nombre.length();
//		System.out.println(ultima_letra);
//		
//		System.out.println("Y la primera letra es la " + nombre.charAt(nombre.length()-1));
		
		/*3. Realiza un programa para determinar si un String es palíndromo
		 */
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("Ingresa una palabra");
		String original=entrada.nextLine();
		String reversa = "";
		
		//Iterando hacia atrás para armar la reversa
		
		for (int i=original.length()-1;i>=0;i--) { //
			reversa = reversa + original.charAt(i);
			
		}
		
		System.out.println("Reversa:" + reversa.replace(" ",""));
		
		if (original.replace(" ","").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");
		}else
			System.out.println("No es palindromo");
		}

}