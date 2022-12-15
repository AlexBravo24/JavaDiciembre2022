package com;

import java.util.Scanner;

public class E14_ELH {

	public static void main(String[] args) {
	
		int horas, pago, extra, pagoExtra, pagoFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el numero de horas trabajadas");
		horas = sc.nextInt();
		
		if(horas <=40) {
			pago = horas *16;
			System.out.println("El pago semana es de "+pago);
		}else if(horas>40) {
			extra = horas-40;
			pago = (horas-extra) *16;
			pagoExtra = extra*20;
			pagoFinal = pagoExtra+pago ;
			System.out.println("El pago semanal es de "+pagoFinal);
		}else {
			System.out.println("Error");
		}
	}
	
	
}
