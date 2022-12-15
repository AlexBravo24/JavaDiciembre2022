package com;

import java.util.Scanner;

public class atletaARRAYY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String nombre[] = new String[];
	double tiempo[] = new double[n];
	double ganador[] = new double[n];
	int n=0;
	int indice = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el numero de corredores que participan:");
	n[i]=sc.nextLine();
	
	for (int i = 0; i< tiempo.length; i++) {
		
		System.out.println("Ingrese el nombre del corredor y el tiempo que hizo:");
		nombre[i]= sc.nextLine();
		tiempo[i]= sc.nextDouble();
	
		
		if (tiempo[i]>ganador) {
			ganador = tiempo[i];
			indice = i;
			
		}
	}
		System.out.println("el corredor que hizo mejor tiempo es;"+nombre[i]+"con un tiempo de"+tiempo[i];)
			
		
			
		}
	
	}


