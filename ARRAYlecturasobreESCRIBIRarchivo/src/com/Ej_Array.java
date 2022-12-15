package com;

import java.util.Scanner;

public class Ej_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		Un array, es un tipo de dato estructurado que permite 
//		almacenar un conjunto de datos homogeneo, es decir,
//		todos ellos del mismo tipo y relacionados.
//		Inician con un indice en la posicion
		
		//int i;
		
//		int [] numeros = new int[9];
//		numeros[0]=1;
//		numeros[1]=2;
//		numeros[2]=3;
//		numeros[3]=4;
//		numeros[4]=5;
//		numeros[5]=6;
//		numeros[6]=7;
//		numeros[7]=8;
//		numeros[8]=9;
//		
//		
//		System.out.println(" El valor del array es = " + numeros[8]);
//		
//		int [] numeros2 =   {1,2,3,4,5,6,7,8,9};
//		
//		for(int i=0; i<numeros2.length;i++) {
//			System.out.println("Su indice del array  = "+ i+  " posicion " +numeros2[i]);
//				
//			
//		}
//		//-------------------------------------------------------------------------------
//		// array con char
//		
//        char [] numeros3 = new char[5];
//
//        Scanner sc = new Scanner(System.in);
//
//        for( int i=0; i<numeros3.length; i++){
//        	System.out.println(" ");
//            System.out.printf("Introduzca número o caracter del arreglo ", i+1);
//            numeros3[i] = sc.next().charAt(0);
//        }
//
//        for(int i=0; i<numeros3.length; i++) {
//            System.out.println("El indice es " +numeros3[i]);
//        }
//        
      //array 10 String 
        
		
		Scanner sc = new Scanner(System.in);
        String []  numeros4 = new String[10];
        
        for(int i=0; i<numeros4.length; i++) {
        	System.out.printf( " Introducca los nombres del areglo " ,i+1);//imprime un mensaje por pantalla utilizando una “cadena de formato” que incluye las instrucciones para mezclar múltiples cadenas en la cadena final a mostrar por pantalla.
        	numeros4[i]= sc.nextLine();	
        }
        
        for (int i=0; i<numeros4.length; i++) {
        	System.out.println("El indice de "+ i + " = " +numeros4[i]);
        }
	}

}
