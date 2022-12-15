package com;

import java.util.Scanner;

public class Ej_07_Director_Escuela_viaje_Escuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		int s;
		float costo;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese el numero de alumnos q van a ir al viaje");
		
		s=sc.nextInt();
		
		
		
		if(s>=100) {
			costo = s*65;
			System.out.println("Numero de alumnos es  = " + s) ;
			System.out.println("EL monto a pagar por alumno es 65 Euros ");
			System.out.println("EL monto recabado es  = " + costo);
			System.out.println("El monto a pagar a la compañia es = " + costo);
			
		}else if((s>=50)&&(s<=99)) {
			costo = s*70;
			System.out.println("El numero de alumnos es = " + s);
			System.out.println("El monto a pagar por alumno es de 70 Euros ");
			System.out.println("El monto recabado es " + costo);
			System.out.println("El monto a pagar a la compañia es = " + costo);
			
			
		}else if((s>=30)&&(s<=49)) {
			costo = s*95;
			System.out.println("El numero de alumnos es = " + s);
			System.out.println("El monto a pagar por alumno es de 95 Euros ");
			System.out.println("El monto recabado es " + costo);
			System.out.println("El monto a pagar a la compañia es = " + costo);
		
		} else if(s<30) {
			costo = 4000;
			System.out.println("El monto a pagar a la compañia es = " + costo);
		}
		
		
		
	}

}
