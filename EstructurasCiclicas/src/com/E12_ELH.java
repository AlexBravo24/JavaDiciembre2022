package com;

import java.util.Scanner;

public class E12_ELH {

	public static void main(String[] args) {
		int n=0,i=0;
		double promedio=0, sumaP=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
		System.out.println("Por favor ingrese una edad");
		n=sc.nextInt();
		sumaP=sumaP+n;
		i++;
		promedio=sumaP/i;
		System.out.println("El promedio es "+promedio);
		if(promedio>25) {
			break;
		}
		
		}while(n>0);
			System.out.println("La suma de las edades es: "+sumaP+
					"\n"+ "La cantidad de edades ingresadas fueron "+ i);
			System.out.println("El promedio es igual a "+promedio);
		if(promedio>25) {
			System.out.println("El promedio es mayor que 25");
		}else {
			System.out.println("");
		}
		
		
		
		
		
	}
}
