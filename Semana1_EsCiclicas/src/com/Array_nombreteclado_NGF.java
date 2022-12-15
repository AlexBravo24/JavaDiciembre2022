package com;

import java.util.Scanner;

public class Array_nombreteclado_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nombres = new String [10];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<nombres.length;i++) {
			System.out.println("Introduce los nombres:");
			nombres[i]=sc.next();
		
		}
			
		//for (int i=0; i<nombres.length;i++) {
		//System.out.println("Los nombres introducidos son: "+nombres[i]);
		for (String i:nombres) {
			System.out.println("nombres: "+i);
			
	}

}
}