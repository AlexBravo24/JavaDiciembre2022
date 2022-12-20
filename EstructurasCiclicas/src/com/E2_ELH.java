package com;

import java.util.Scanner;

public class E2_ELH {
	
public static void main(String[] args) {
	int i, nI, nF,op;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Por favor ingrese el numero que desea saber la tabla de multiplicar");
	nI = sc.nextInt();
	System.out.println("Por favor ingrese hasta que numero desea que llegue esa tabla de multilicar");
	nF= sc.nextInt();
	
	for (i=1;i<=nF;i++) {
		op=i*nI;
		System.out.println(nI+" * "+ i +" = "+op);
	}
}

}
