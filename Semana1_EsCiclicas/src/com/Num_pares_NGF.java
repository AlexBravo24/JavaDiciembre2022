package com;

import java.util.Scanner;

public class Num_pares_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Programa 9.- Que lea 2 numeros y muestre los numeros pares entre ellos
		
		//Lectura de dos números enteros A Y B
        //A debe ser menor que B
		
		 Scanner sc = new Scanner(System.in);
		 
	        int A, B;
        do {
            System.out.print("Introduce un número entero: ");
            A = sc.nextInt();
            System.out.print("Introduce otro número entero mayor que el anterior: ");
            B = sc.nextInt();
            if (A >= B) {
                System.out.println("El segundo número debe ser mayor que el primero");                  
            }
        } while (A >= B);


        //Mostrar los números pares entre A y B.
        System.out.println("\nNúmeros pares desde " + A + " hasta " + B + " : ");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

	}

