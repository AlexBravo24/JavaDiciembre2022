package com;

import java.util.Scanner;

public class Ej_06_Asociacion_Vinicultores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
		
		String tipo;
		int tamaño;
		String s;
		double precio=0, total=0;
		
		
		System.out.println( " Ingrese el Precio de la uva:.. " );
		precio=leer.nextDouble();
		
		System.out.println( " Ingrese el tipo de la uva A ó B:.. " );
		s=leer.next();
		tipo =(s);

     	System.out.println( " Ingrese el tamaño es la uva 1 ó 2:.. " );
		tamaño= leer.nextInt();
		
		if(tipo.equals("A")&&(tamaño==1)) {
			   total=precio+.20;
			   System.out.println("El Precio Inicial es " + total);
		}
		
		if (tipo.equals("A")&&(tamaño==2)) {
			total = precio+.30;
			System.out.println("El Precio Inicial es " + total);
		}

		if(tipo.equals("B")&&(tamaño==1)) {
				   total=precio-.30;
				   System.out.println("El Precio Inicial es " + total);
		}
					
		if (tipo.equals("B")&&(tamaño==2)) {
			total = precio-.50;
			System.out.println("El Precio Inicial es " + total);
	    }

	}

}
