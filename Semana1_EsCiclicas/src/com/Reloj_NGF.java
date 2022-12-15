package com;

import java.util.Scanner;

public class Reloj_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Programa 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 00:00:00
//		horas hasta las 23:59:59 horas
		
		Scanner sc =new Scanner(System.in);
		
		int horas, min, seg;
		
		for(horas=0;horas<23;horas++);
			for (min=0;min<=59;min++)
				for(seg=0;seg<=59;seg++) {
					System.out.println(horas+":"+min+":"+seg);
				}
			}
}
