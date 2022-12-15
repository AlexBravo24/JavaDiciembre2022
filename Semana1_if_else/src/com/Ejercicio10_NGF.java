package com;

import java.util.Scanner;

public class Ejercicio10_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
mes correspondiente.*/
		
        int mes;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa el numero del MES que quieres: ");
		mes=sc.nextInt();
		
		if (mes==1) {
			System.out.println("ENERO CON 31 DIAS ");
	
		} else	if (mes==2) {
				System.out.println("FEBRERO CON 28 DIAS");
		} else	if (mes==3) {
				System.out.println("MARZO CON 31 DIAS");				
		} else	if (mes==4) {
			System.out.println("ABRIL CON 30 DIAS");
		} else	if (mes==5) {
			System.out.println("MAYO CON 31 DIAS");
		} else	if (mes==6) {
			System.out.println("JUNIO CON 30 DIAS");
		} else	if (mes==7) {
			System.out.println("JULIO CON 31 DIAS");
		} else	if (mes==8) {
			System.out.println("AGOSTO CON 31 DIAS");
		} else	if (mes==9) {
			System.out.println("SEPTIEMBRE CON 30 DIAS");				
		} else	if (mes==10) {
		System.out.println("OCTUBRE CON 31 DIAS");
		} else	if (mes==11) {
		System.out.println("NOVIEMBRE CON 30 DIAS");
		} else	if (mes==12) {
		System.out.println("DICIEMBRE CON 31 DIAS");

	} else	
		System.out.println("ERROR NUMERO INCORRECTO");

	}

}
