package com;

import java.util.Scanner;

public class Ejercicio4_ELH {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String x,y;
		
		System.out.println("Ingrese una letra");
		x=sc.next();
		y=x.toLowerCase();
		if(x==y) {
			System.out.println("no tiene mayuscula");
		}else {
			
			System.out.println("Tiene mayuscula");
			
		}
	}
	
}
