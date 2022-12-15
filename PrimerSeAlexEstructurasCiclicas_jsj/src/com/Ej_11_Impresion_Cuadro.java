package com;

import java.util.Scanner;

public class Ej_11_Impresion_Cuadro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese el tamño del cuadro");
		n=sc.nextInt();
		
		
		for (int i=1; i <= n ; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	
	}

}
