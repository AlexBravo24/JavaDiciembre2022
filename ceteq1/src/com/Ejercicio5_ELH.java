package com;

import java.util.Scanner;

public class Ejercicio5_ELH {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int edad;
		int nota;
		char sexo;
		
		System.out.println("Escribe la nota");
		nota=sc.nextInt();
		System.out.println("Escribe la edad");
		edad=sc.nextInt();
		System.out.println("Escribe el sexo");
		sexo=sc.next().charAt(0);
		
		if(nota>=5 && edad>=18 && sexo=='M') {
			System.out.println("POSIBLE");
		}else if(nota>=5&& edad>=18 && sexo=='F') {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
	}

}
