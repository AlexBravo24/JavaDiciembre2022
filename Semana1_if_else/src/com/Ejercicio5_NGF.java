package com;

import java.util.Scanner;

public class Ejercicio5_NGF {
 
	public static void main(String[] args) {
		

		//5. Realiza un programa que calcule la aceptación de una solicitud
		//en base a los siguientes parámetros: edad, nota y sexo. * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE *
		//Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA * Otros casos -> NO ACEPTADA
		
		
			int edad;
			int nota ;
			String sexo;
			int s;
			
			Scanner sc =new Scanner(System.in);
			
			System.out.println(" Ingrese la edad de la persona ");
			s=sc.nextInt();
			edad =(s);
		        
			System.out.println(" Ingrese la nota de la persona ");
			s =sc.nextInt();
			nota =(s);
			
			System.out.println(" Ingreso el sexo de la persona ");
			sexo = sc.next();
			
			if((edad >=18)&&(nota>=5)&&(sexo.equals("f"))) {
				System.out.println("ACEPTADA");
			   
			}else {
				if((edad >=18)&&(nota>=5)&&(sexo.equals("m"))) {
				System.out.println("POSIBLE");
			    }
				else {
					System.out.println("NO ACEPTADA");	
				}
			 }
			
			
		}


	}

