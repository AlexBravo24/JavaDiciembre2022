package com;

import java.util.Scanner;

public class Ej_02_Num_Par_Impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejercicio if else con scanner
		float numero;
		Scanner sc =new Scanner(System.in);
		System.out.println("Ingrese el numero a avaluar ");
	        numero =sc.nextFloat();
	        if ( numero % 2 == 0 ){
	            System.out.println( "EL NUMERO EVALUADO ES PAR" );
	        }else
	        {
	            System.out.println( "EL NUMERO EVALUADOR ES IMPAR" );
	        }
	}

}
