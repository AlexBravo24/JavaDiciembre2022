package com;

import java.util.Scanner;

public class E11_ELH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double peso, precio;
		int zona;
		
		System.out.println("Digite el peso del paquete a enviar");
		peso = sc.nextDouble();
		System.out.println("Digite el numero de zona al que desea enviar"
				+ "1 America del norte, 2 America central, 3 AMerica del sur, 4 Europa, 5 Asia");
		zona = sc.nextInt();
		
		if(peso<=5 && zona ==1) {
			precio = peso*24;
			System.out.println("El costo por envio es de "+precio);
		}else if(peso<=5 && zona ==2) {
			precio = peso*20;
			System.out.println("El costo por envio es de "+precio);
		}else if(peso<=5 && zona ==3) {
			precio = peso*21;
			System.out.println("El costo por envio es de "+precio);
		}else if(peso<=5 && zona ==4) {
			precio = peso*10;
			System.out.println("El costo por envio es de "+precio);
		}else if(peso<=5 && zona ==5) {
			precio = peso*18;
			System.out.println("El cosot por envio es de "+precio);	
		}else if(peso>5) {
			System.out.println("El peso es mayor al estimado, por lo tanto no se puede realizar su envio");
		}else {
			System.out.println("Los datos ingresados son incorrectos favor de verificar");
		}
		
		
	}
	
}
