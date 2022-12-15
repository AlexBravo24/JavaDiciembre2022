package com;

import java.util.Scanner;


public class casoswitch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	    
		String s;
		float uno,dos, res;
		char operador;
		
		System.out.println("ingrese un numero");
		s= sc.nextLine();
		uno = Float.valueOf(s);
		System.out.println("Ingrese otro numero");
		s= sc.nextLine();
		dos= Float.valueOf(s);
		System.out.println("Ingrese un operador aritmetico");
		s= sc.nextLine();
		operador = s.charAt(0);
		
					switch (operador) {  
		
					case '+':
								res = uno+dos;
								System.out.println(res);
								break;
		            case '-':
		            			res = uno-dos;
		            			System.out.println(res);
								break;
		            case '*':			
								res= uno*dos;
								System.out.println(res);
								break;
		            case '/': 
		            			res = uno/dos;
		            			System.out.println(res);
		            			break;
		            default:
	        			        System.out.println("operador no identificado");

	}
	
				}
			            
	            	           			
	           }
	
	


