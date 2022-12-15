package com;

import java.util.Scanner;

public class Ejercicio14_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
primeras 40 horas y $20 por cada hora extra*/
		
		int hora, horaextra;
		float salario, salariof,montoextra;

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa el numero de horas trabajadas:  ");
		hora =sc.nextInt();
		
		if (hora<=40) {
			salario=hora*16;
			System.out.println("El total de salario es de :" +salario);		
			
		}else if (hora>40) {
			horaextra=hora-40;
			montoextra=horaextra*20;
			salariof= ((40*16)+(montoextra));
			System.out.println("El numero de horas extras es: : "+horaextra);		
			System.out.println("El total de salario es de : "+salariof);		
		}		
		
	}

}
