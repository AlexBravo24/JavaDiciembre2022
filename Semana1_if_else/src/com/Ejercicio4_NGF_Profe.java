package com;

import java.util.Scanner;

public class Ejercicio4_NGF_Profe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Identifica si una letra es mayuscula o minuscula
		
		Scanner sc= new Scanner(System.in);
		
		String x,y;
		
		System.out.println("Ingrese una letra");
		x=sc.next();
		y=x.toUpperCase();
		if(x==y) {
			System.out.println("La letra es Mayuscula");
		}else {
			System.out.println("La letra es minuscula");
		}
				
		}

}
