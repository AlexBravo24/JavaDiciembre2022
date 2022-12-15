package com;

import java.util.Scanner;

public class salariomayor {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre[] = new String[5];
		float salario[] = new float[5];
		float mayor = 0;
		int indice = 0;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa 5 trabajadores cada uno con su respectivo sueldo:");
		for(int i =0; i<nombre.length; i++) {
		nombre[i] = sc.nextLine();
		salario[i] = Float.valueOf(sc.nextLine());
		if(salario[i]>mayor) {
			mayor = salario[i];
			indice = i;
	
			
		}
		}
				
	}
}

