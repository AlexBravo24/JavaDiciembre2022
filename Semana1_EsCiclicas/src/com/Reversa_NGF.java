package com;

import java.util.Scanner;

public class Reversa_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("Ingresa una palabra");
	
		String original=entrada.nextLine();
		String reversa="";
		
		//Iterando hacia atras para armar la reversa
		
		for (int i=original.length() -1;i>=0;i--) {
			reversa = reversa + original.charAt(i);
		}
		
		System.out.println("Reversa:" + reversa.replace(" "," "));
		
		if (original.replace(" ","").equalsIgnoreCase(reversa.replace(" ", ""))) {
		} else 
			System.out.println("No es palindromo");
	}
	
					
	}

