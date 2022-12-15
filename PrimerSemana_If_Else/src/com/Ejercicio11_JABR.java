package com;

import java.util.Scanner;

public class Ejercicio11_JABR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ameN=24;
		int ameC=20;
		int ameS=21;
		int eur=10;
		int asia=18;
		int zona;
		int peso;
				
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduzca el número de área del paquete");
		zona=lector.nextInt();
		System.out.println("Introduzca el peso del paquete en Kg");
		peso=lector.nextInt();
		if (zona==1 && peso<6 && peso>0) {
		System.out.println("El cobro de la entrega es de " + (ameN*peso));
		}else if (zona==2 && peso<6 && peso>0) {
			System.out.println("El cobro del paquete es de " + (ameC*peso));
		}else if (zona==3 && peso<6 && peso>0) {
			System.out.println("El cobro del paquete es de " + (ameS*peso));	
		}else if (zona==4 && peso<6 && peso>0) {
			System.out.println("El cobro del paquete es de " + (eur*peso));
		}else if (zona==5 && peso<6 & peso>0) {
			System.out.println("El cobro del paquete es de " + (asia*peso));
		}else {
			System.out.println("Entrega rechazada");
		}
		
		}


	}


