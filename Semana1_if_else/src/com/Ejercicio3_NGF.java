package com;

import java.util.Scanner;

public class Ejercicio3_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		segundo número es 0, debe mostrar un mensaje de error*/
		
		double x,y;
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		x=sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		y=sc.nextInt();
		
		if(y !=0) {
			resultado = x/y;
			System.out.println("El resultado de la division es"+resultado);
		}else {
			
			System.out.println("El segundo numero ingresado es igual a cero");
			
			
		}
			
	}

}
