package com;

import java.util.Scanner;

public class Ej_12_Promedio_Edades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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


