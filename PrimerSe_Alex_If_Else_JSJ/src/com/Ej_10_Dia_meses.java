package com;

import java.util.Scanner;

public class Ej_10_Dia_meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,dia;
		  Scanner sc = new Scanner (System.in);
	        System.out.println("Ingrese numero del MES");
	        s=sc.nextInt();
		
	        if(s==1) {
	        	System.out.println("EL numero de dia es " + s + " El mes es ENERO Y TIENE 31 DIAS");
	        }else if(s==2) {
	        	System.out.println("EL numero de dia es " + s + " El mes es FEBRERO Y TIENE 28 DIAS");
	        }else if(s==3) {
	        	System.out.println("EL numero de dia es " + s + " El mes es MARZO Y TIENE 31 DIAS");
	        }else if(s==4) {
	        	System.out.println("EL numero de dia es " + s + " El mes es ABRIL Y TIENE 30 DIAS");
	        }else if(s==5) {
	        	System.out.println("EL numero de dia es " + s + " El mes es MAYO Y TIENE 31 DIAS");
	        }else if(s==6) {
	        	System.out.println("EL numero de dia es " + s + " El mes es JUNIO Y TIENE 30 DIAS");
	        }else if(s==7) {
	        	System.out.println("EL numero de dia es " + s + " El mes es JULIO Y TIENE 31 DIAS");
	        }else if(s==8) {
		        System.out.println("EL numero de dia es " + s + " El mes es AGOSTO Y TIENE 31 DIAS");
		    }else if(s==9) {
		        System.out.println("EL numero de dia es " + s + " El mes es SEPTIEMBRE Y TIENE 28 DIAS");
		    }else if(s==10) {
		        System.out.println("EL numero de dia es " + s + " El mes es OCTUBRE Y TIENE 31 DIAS");
		    }else if(s==11) {
		        System.out.println("EL numero de dia es " + s + " El mes es NOVIEMBRE Y TIENE 30 DIAS");
		    }else if(s==12) {
		        System.out.println("EL numero de dia es " + s + " El mes es DICIEMBRE Y TIENE 31 DIAS");
	        }else if((s<=0)||(s>12)) {
	        	System.out.println("EL numero de MES es " + s + " ERROR ESE MES NO EXISTE");
	        }
	}

}
