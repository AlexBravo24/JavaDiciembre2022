package com;

import java.util.Scanner;

public class Ej_03_Resultado_division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float num1, num2, res;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("ingrese el  primer numero");
		num1 = sc.nextFloat();
		System.out.println("ingrese el segundo numero");
		num2 = sc.nextFloat();
		
		res = num1/num2;
		
		if(num2 == 0) {
			System.out.println("2do numero  no valido la operacion no se puede realizar ");
		}else {
			System.out.println(" El resltado es : " + res);
		}
	}

}
