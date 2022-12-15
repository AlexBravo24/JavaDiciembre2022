package com;

public class Ej_07_Inversion_Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double inv=700;
		double interes=0.02;
		double total=0;
		double tol=1500;
		
		
		for(int i=1; i<=12; i++) {
			inv = inv + (inv*interes);
			System.out.println(inv);
			
			for (int n=1; n  <= 1500; n++) {
				tol=inv ;
				System.out.println("La inversion sera de " + tol);
			}
		}
		System.out.println("En un año, la cantidad total sera " + inv);
		System.out.printf("%.2f",inv);

	}

}
