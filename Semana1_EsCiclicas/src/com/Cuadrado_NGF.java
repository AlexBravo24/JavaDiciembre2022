package com;

import java.util.Scanner;

public class Cuadrado_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String simbolo="*";
//		int ancho=8;
//		int largo=8;
//		
//			
//		for( ancho=0;ancho<=8;ancho++) {
//			for ( largo=0;largo<=8;largo++) {
//				
//				System.out.print(simbolo);
//				
//							
//		} System.out.println();
//
//	}
//	}




		String simbolo="*";
		int ancho;
		int largo;
		
		Scanner sc = new Scanner(System.in);
				
				System.out.println("Introduce el ancho de la figura:");
				ancho = sc.nextInt();
				System.out.println("Introduce el largo de la figura:");
				largo = sc.nextInt();

	
for( int i=1;i<=ancho;i++) {
	for ( int j=1;j<=largo;j++) {
		
		System.out.print(simbolo);
		
					
} System.out.println();

}
}

}
