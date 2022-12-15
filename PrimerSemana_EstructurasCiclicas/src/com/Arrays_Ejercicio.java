package com;

import java.util.Scanner;

public class Arrays_Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombres[]=new String [2];
		Scanner entrada =new Scanner (System.in);
		
		for (int i = 0; i<3; i++) {
			System.out.println("Introduce un nombre");
			nombres[i]=entrada.next();
		}
		
		for (String i:nombres) {
			System.out.println("Nombre: " + i);
		}

	}

}
