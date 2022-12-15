package com;

import java.util.Scanner;

public class Ejercicio2_hvvn {

	public static void main(String[] args) {
		//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario
		
		Scanner Scan = new Scanner(System.in);
		int numero1,numero2,i;
		System.out.println("Digite el primer digito: ");
		numero1 = Scan.nextInt();
		System.out.println("Digite el segundo numero: ");
		numero2 = Scan.nextInt();
		
		for (i=1;i<=numero2;i++) {
			System.out.println(numero1+"*"+i+"="+(numero1*i));
			
		}
	}

}
