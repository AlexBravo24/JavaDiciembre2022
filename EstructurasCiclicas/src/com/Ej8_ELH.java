package com;

import java.util.Scanner;

public class Ej8_ELH {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		String simbolo = "*";
		int ancho;
		int largo;
		
		System.out.println("Digite el ancho requerido: ");
		ancho = Scan.nextInt();
		System.out.println("Digite el largo requerido: ");
		largo = Scan.nextInt();
		
		for (int i=1;i<=ancho;i++) {
			for(int j=1;j<=largo;j++) {
				
				System.out.print(simbolo);
			}
			System.out.println();
		}


	}
	
}

