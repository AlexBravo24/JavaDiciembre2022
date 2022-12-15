package com;

import java.util.Scanner;

public class EjercicioCuadro_JABR {

	public static void main(String[] args) {
		
		/*12.Se ingresan un conjunto de n edades de personas por teclado. 
		 * El programa finalizara cuando el promedio de las edades sea superior a 25.
		 */

		int promedio = 0;
		int edad = 0;
		int contador = 0;
		int sumaP = 0;
		
		Scanner lector = new Scanner (System.in);
		
			
		do {
			   System.out.println("Ingrese una edad");
			   edad=lector.nextInt();
			   sumaP=sumaP+edad;
			   contador= contador+1;
			   promedio=sumaP/contador;
			  System.out.println("El promedio por ahora es " +promedio);
			   if (promedio>25) {
			   break;
			  }
		} while (edad>0);
		  System.out.println("La suma de las edades es :" + sumaP   + " La Cantidad  de edades ingresadas fueron: "+ contador);
		  System.out.println("El promedio es igual a: "+promedio);
		  if (promedio>25) {
		   System.out.println("El promedio es mayor que 25 y ha finalizado el programa");
		  }else {
		   System.out.println("Reinicia el programa ya que el promedio no fue superior a 25");
		  }

		}
	
}