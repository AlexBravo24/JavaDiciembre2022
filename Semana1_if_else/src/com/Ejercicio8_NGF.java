package com;

import java.util.Scanner;

public class Ejercicio8_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
obtenido*/
		
		int resultdado;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa el resultado del dado: ");
		resultdado=sc.nextInt();
		
		if (resultdado==1) {
			System.out.println("La cara opuesta de 1 es: SEIS");
	
		} else	if (resultdado==2) {
				System.out.println("La cara opuesta de 2 es: CINCO");
		} else	if (resultdado==3) {
				System.out.println("La cara opuesta de 3 es: CUATRO");				
		} else	if (resultdado==6) {
			System.out.println("La cara opuesta de 6 es: UNO");
		} else	if (resultdado==5) {
			System.out.println("La cara opuesta de 5 es: DOS");
		} else	if (resultdado==4) {
			System.out.println("La cara opuesta de 4 es:TRES");
	} else	
		System.out.println("ERROR NUMERO INCORRECTO");
			
		}

	}

