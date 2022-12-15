package com;

import java.util.Scanner;

public class E9_ELH {

	public static void main(String[] args) {
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un numero entre 1 y 7");
		dia =sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Juves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Error");
		}
	}
	
}
