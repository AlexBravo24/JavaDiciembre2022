package com;

import java.util.Scanner;

public class E4_ELH {
	
	public static void main(String[] args) {
		String frase;
		char c;
		int contador=0;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Por favor ingrese una frase");
	frase = sc.nextLine();
	System.out.println("Por favor ingrese la letra que desea encontrar");
	c = sc.next().charAt(0);
	
	for (int i=0; i<frase.length();i++) {
		if(frase.charAt(i)== c) {
			contador++;
			
		}
		
	}
	if(contador!=0) {
	
		System.out.println("El caracterer "+c+" se encuentra "+contador+" numero de veces");
		
	}else {
		System.out.println("NO SE ENCUENTRA");
	}
	}
}
