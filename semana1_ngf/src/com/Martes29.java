package com;

import java.util.Scanner;

public class Martes29 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//		int n1 = 5;
//		int n2 = 0;
//		
//			if (n2 == 0) { System.out.println("no se puede efectuar la division entre cero");
	

			Scanner sc =new Scanner(System.in);
			float n1, n2, r;
			System.out.println("ingrese valor n1");
				n1 =sc.nextFloat();
				
			System.out.println("ingrese valor n2");
				n2 =sc.nextFloat();	
				
				if (n2 == 0) { 
					System.out.println("no se puede efectuar la division entre cero");
				}else  {
					r=n1/n2;
					System.out.println("El resultado de la division de n1/n2 es:"+r);
		
	}
		
	}
	}

		
	
					
					
					
					
