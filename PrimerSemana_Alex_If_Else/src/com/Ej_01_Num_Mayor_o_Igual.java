package com;

import java.util.Scanner;

public class Ej_01_Num_Mayor_o_Igual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese primer valor");
		x=sc.nextInt();	
		System.out.println("Ingrese segundo valor");
		y=sc.nextInt();	
		
		if(x<y) {
			System.out.println("El primer valo es menor");
		}else if (x>y) {
			System.out.println("El segundo numero es mayor");
		}else if (x==y) {
			System.out.println("Los dos numeros son iguales");
		}
	}

}
