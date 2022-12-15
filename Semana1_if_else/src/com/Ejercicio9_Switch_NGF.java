package com;

import java.util.Scanner;

public class Ejercicio9_Switch_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa el numero del dia de la semana: ");
		dia=sc.nextInt();
		
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
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Error de dia");
				
			
		}
	}

}
