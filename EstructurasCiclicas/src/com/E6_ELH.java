package com;

public class E6_ELH {
	public static void main(String[] args) {
		double  inv=1000;
		double interes = 0.02;
		double total=0;
		
		
		for(int i=1; i<13;i++) {
			inv=inv+(inv*interes);
			System.out.println(inv);
		}
		System.out.printf("En un año, la cantida total sera de "+"%.2f",inv);
		
	}

}
