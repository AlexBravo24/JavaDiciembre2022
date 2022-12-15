package com;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulador=0, p;
		double a [] =new double [5];
		
	for (int i=0; i<a.length; i++) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese la calificacion:");
	a[i] = sc.nextDouble();
	
	}
	
	for(int i=0; i<a.length;i++) {
		acumulador = acumulador + a[i];
	
	}
	p= acumulador/5;
	System.out.println("promedio es igual a:" +p);
	}

}


