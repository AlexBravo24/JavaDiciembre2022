package com;

public class Arrays {

	public static void main(String[] args) {
		
			/*Los arrays o arreglos son una estructura de datos que
			 * pueden almacenar una cantidad determinada de los mismos y que deben ser del mismo tipo
			 * (un tipo en común)
			 * 
			 * Inician con un índice en la posición 0.
			 */
		
		int [] numeros = new int [9]; //Un array de números enteros con su tamaño declarado
		
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		
		
		
		//System.out.println(numeros[9]);
		
		
		int[] numeros2 = {1,2,3,4,5,6,7,8,9}; //Un array de 9 números, con los valores ya declarados
		
//		for (int i=0;i<numeros2.length;i++) {
//			System.out.println("Indice "+i+" = "+ numeros2[i]);
//		}
		
		for (int i:numeros2) {
			System.out.println(i);
		}
		
		String []nombres = new String [2];
		
		nombres[0]="Alex";
		nombres[1]="Diana";
		
		System.out.println(nombres[1]);
	}
	
	
	

}
