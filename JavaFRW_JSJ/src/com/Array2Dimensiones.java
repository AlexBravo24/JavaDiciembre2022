package com;

import java.util.Scanner;

public class Array2Dimensiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		
//		int tabla[][]= new int[3][3];
//		int x=0;
//		System.out.println(tabla.length);
//		System.out.println(tabla[0].length);
//		
//		for(int j=0;j<tabla.length;j++) {
//			
//			for(int i=0; i<tabla[j].length;i++) {
//				x++;
// 			tabla[j] [i] = x;
//				System.out.print( tabla[j][i]);
//			}
//			System.out.println();
//		}
		
		
	int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i=0;i<3;i++) {
			System.out.println();
			for (int j=0;j<3;j++) {
				System.out.print(matriz[i][j] + " ");
			}
		  }
		
		}	
	}
