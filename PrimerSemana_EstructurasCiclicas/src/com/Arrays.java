package com;

public class Arrays {

	public static void main(String[] args) {
		// Los Array o arreglos son una estructura de datos que pueden
		//almacenar una cantidad determinada de los mismos y que deben ser
		//del mismo tipo en comun.
		//
		// Inician con un indice en la posicion 0.
		
//		int [] numeros = new int[9]; //Un Array de numeros enteros con su tamaño declarado
//		
//		numeros[0]=1;
//		numeros[1]=2;
//		numeros[2]=3;
//		numeros[3]=4;
//		numeros[4]=5;
//		numeros[5]=6;
//		numeros[6]=7;
//		numeros[7]=8;
//		numeros[8]=9;
		//System.out.println(numeros[8]);
		
//		int[] numeros2 = {1,2,3,4,5,6,7,8,9};  // Un Array de 9 numeros, com valores ya declarados
//		
//		
//		for (int i=0; i<numeros2.length; i++) {
//			System.out.println("Indice"+i+"="+numeros2[i]);
//		}
		
		
		char[] caracter = {'a','b','c','d','e','f','g','h','i','j'};  // Array de 10 caracteres que los imprime
		for (int i=0; i<caracter.length; i++) {
			System.out.println("indice" +i+ "=" +caracter[i]);
			
		}
//		String [] nombres = {"hugo","daniel","roberto","ximena","adriana","alejandro","laura","pedro","ana","sofia"};
//		for (int i=0; i<nombres.length;i++) {
//			System.out.println("indice" +i+ "="+nombres[i]);
//		}

	}

}
