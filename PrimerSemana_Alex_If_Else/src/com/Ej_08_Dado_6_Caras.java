package com;

import java.util.Scanner;


public class Ej_08_Dado_6_Caras {

    public static void main(String[] args) {
    	int s;
    	
    	
    	
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese numero de dado");
        s=sc.nextInt();
 
        	if(s==1) {
        		System.out.println("El numero del dado es  "+s + " La cara opuesta es  Seis");
        	}else if (s==2) {
        		System.out.println("El numero del dado es   "+s + " La cara opuesta es  Cinco");
        	}else if(s==3) {
        		System.out.println("El numero del dado es   "+s + " La cara opuesta es  Cuatro");
        	}else if(s==4) {
        		System.out.println("El numero del dado es   "+s + " La cara opuesta es  Tres");
        	}else if(s==5) {
        		System.out.println("El numero del dado es   "+s + " La cara opuesta es  Dos");
        	}else if(s==6) {
        		System.out.println("El numero del dado es   "+s + " La cara opuesta es  Uno");
        	}else if((s<=0)||(s>6)) {
        		System.out.println("Numero invalido ERROR");
        	}
        	
        	
        	
        	
        	}
    }


