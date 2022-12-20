package com;

import java.util.Scanner;

public class E12_ELH {

	public static void main(String[] args) {
		 
		double peso, altura,IMC;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para calcular su Indice de masa corporal primero digite su peso");
		peso = sc.nextDouble();
		System.out.println("Por favor ahora digite su altura");
		altura = sc.nextDouble();
		
		IMC = peso/altura;
		
		if(IMC<16) {
			System.out.println("Criterio de ingreso en hospital");
		} else if(IMC>=16 && IMC<=17) {
			System.out.println("Infrapeso");
		}else if(IMC>17 && IMC<=18) {
			System.out.println("Bajopeso");
		}else if(IMC>18 && IMC<=25) {
			System.out.println("Peso normal (saludable)");
		}else if(IMC>25 && IMC<=30) {
			System.out.println("Sobre peso (obesidad grado l");
		}else if(IMC>30 && IMC<=35) {
			System.out.println("Sobre peso cronico (Obesidad de grado ll");
		}else if(IMC>35 && IMC<=40) {
			System.out.println("Obesidad premorbida (obesidad grado lll");
		}else if(IMC>40) {
			System.out.println("Obeidad morbida (obesidad grado lV");
		}
	}
	
	
}
