package com;

import java.util.Scanner;

public class Ej_06Inversion_Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int contador=0;
		double inv=1000;
		double interes=0.02;
		double total=0;
		
		
		
		for(int i=1; i<=12; i++) {
			inv = inv + (inv*interes);
			System.out.println(inv);
		}
		System.out.println("En un año, la cantidad total sera " + inv);
		System.out.printf("%.2f",inv);
	   }
		
	}


