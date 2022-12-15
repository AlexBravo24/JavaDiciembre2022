package com;

import java.util.Scanner;

public class Ej_14_HorasExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int hora, horaextra = 0, salario, montoextra;
 
 
 Scanner lector =new Scanner(System.in);
		
		System.out.println("Introduce el monto de la donación");
		hora=lector.nextInt();
		if(hora<=40) {
			salario=hora*16;
			System.out.println("Ingrese el numero de hora trabajadas " + salario);
		}else if(hora>40) {
			horaextra = horaextra*20;
			montoextra=horaextra*20;
			salario=(40*16) +( montoextra);
			System.out.println(horaextra);
			System.out.println(salario);
		}
	}

}
