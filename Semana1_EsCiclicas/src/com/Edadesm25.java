package com;

import java.util.Scanner;

public class Edadesm25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara cuando el promedio de las 
//	edades sea superior a 25
		
//		int nedades;
//		int promedio;
//		int contador;
//		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("Ingresa el numero de edades a promediar:");
//		nedades = sc.nextInt();
//		
//		for 
		
		int promedio;
		int edad;
		int contador = 0;
		int sumaP = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.println("Ingresa una edad");
			edad=entrada.nextInt();
			sumaP=sumaP+edad; //Sumar las edades
			contador++; //Lleva la cuenta de cuantos datos o edades hemos ingresado
			promedio=sumaP/contador;
			System.out.println("El promedio por ahora es " + promedio);
			if (promedio>25) {
				break;
			}
			
		}while (edad>0); //mientras la edad sea mayor a 0
		
		
		System.out.println("La suma de las edades es :" + sumaP + "\nLa cantidad de edades ingresadas fueron " + contador);
		System.out.println("El promedio es igual a: " + promedio);
					
		}

}
