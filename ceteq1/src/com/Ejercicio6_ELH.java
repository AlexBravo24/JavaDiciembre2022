package com;

import java.util.Scanner;

public class Ejercicio6_ELH {
	/*La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
	clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
	es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
	entrega en un embarque considerando lo siguiente:
	* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
	es de tamaño 2.
	* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
	tamaño 2.
	Precio inicial se recibe desde teclado*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precioI=0, precioF=0;
		char tipo=0, tipo1;
		int tamaño;
		
		
		System.out.println("Por favor ingrese el precio inical del kilo de uva ");
		precioI= sc.nextDouble();
		System.out.println("Escriba la clasificacion de su uva, ya sea A o B");
		tipo = sc.next().charAt(0);
		System.out.println( "Escriba el tamaño de su uva ya sea 1 o 2");
		tamaño = sc.nextInt();
		
		if(tipo == 'A' || tipo == 'a' && tamaño == 1) {
			precioF = precioI+0.20;
			System.out.println("Dado que la clasificacion de su uva es "+tipo+" y de tamaño "+tamaño+""
					+ " el precio por kilo de uva es de "+precioF);
		}else if (tipo == 'A' | tipo == 'a' && tamaño == 2) {
			precioF = precioI+0.30;
			System.out.println("Dado que la clasificacion de su uva es "+tipo+" y de tamaño "+tamaño+""
					+ " el precio por kilo de uva es de "+precioF);
		}else if (tipo == 'B' | tipo == 'b' && tamaño == 1) {
			precioF = precioI-0.30;
			System.out.println("Dado que la clasificacion de su uva es "+tipo+" y de tamaño "+tamaño+""
					+ " el precio por kilo de uva es de "+precioF);
		}else if (tipo == 'B' | tipo == 'b' && tamaño == 2) {
			precioF = precioI-0.50;
			System.out.println("Dado que la clasificacion de su uva es "+tipo+" y de tamaño "+tamaño+""
					+ " el precio por kilo de uva es de "+precioF);
			
		}else {
			System.out.println("Los datos ingresados son incorrectos por favor ingrese los datos nuevamente");
		}
		
		
		
	}

}
