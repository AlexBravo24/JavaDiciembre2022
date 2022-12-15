package com;

import java.util.Scanner;

public class Ej_09_Dia_Semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s,dia;
		  Scanner sc = new Scanner (System.in);
	        System.out.println("Ingrese numero del dia de la semana");
	        s=sc.nextInt();
	        
	        if(s==1) {
	        	System.out.println("EL numero de dia es " + s + " El numero corresponde a LUNES");
	        }else if(s==2) {
	        	System.out.println("EL numero de dia es " + s + " El numero corresponde a MARTES");
	        }else if(s==3) {
	        	System.out.println("EL numero de dia es " + s + " El numero corresponde a MIERCOLES");
	        }else if(s==4) {
	        	System.out.println("EL numero de dia es " + s + " El numero corresponde a JUEVES");
	        }else if(s==5) {
	        	System.out.println("EL numero de dia es " + s + " El numero corresponde a VIERNES");
	        }else if(s==6) {
	        	System.out.println("EL numero de dia es " + s + " El numero corresponde a SABADO");
	        }else if(s==7) {
	        	System.out.println("EL numero de dia es " + s + " El numero corresponde a DOMINGO");
	        }else if((s<=0)||(s>6)) {
	        	System.out.println("EL numero de dia es " + s + " ERROR ESE DIA NO EXISTE");
	        }
		
	}

}
