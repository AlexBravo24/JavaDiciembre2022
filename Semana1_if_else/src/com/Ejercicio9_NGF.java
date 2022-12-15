package com;

import java.util.Scanner;

public class Ejercicio9_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
		introducimos otro número nos da un error.*/
		
		int dia;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa el numero del dia de la semana: ");
		dia=sc.nextInt();
		
		if (dia==1) {
			System.out.println("LUNES");
	
		} else	if (dia==2) {
				System.out.println("MARTES");
		} else	if (dia==3) {
				System.out.println("MIERCOLES");				
		} else	if (dia==4) {
			System.out.println("JUEVES");
		} else	if (dia==5) {
			System.out.println("VIERNES");
		} else	if (dia==6) {
			System.out.println("SABADO");
		} else	if (dia==7) {
			System.out.println("DOMINGO");
	} else	
		System.out.println("ERROR NUMERO INCORRECTO");
	}

}
