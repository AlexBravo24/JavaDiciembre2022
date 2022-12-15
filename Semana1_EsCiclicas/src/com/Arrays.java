package com;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros = new int [9]; // UN ARRAY DE NUMEROS ENTEROS CON SU TAMAÑO DECLARADO
		
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		
//		System.out.println(numeros[8]);
		
		int[] numeros2 = {1,2,3,4,5,6,7,8,9};//UN ARRAY DE 9 NUMEROS CON LOS VALORES YA DECLARADOS
		
		for (int i=0;i<numeros2.length;i++) {
			System.out.println("Indice "+i+"="+numeros2[i]);
		}
	}

}
