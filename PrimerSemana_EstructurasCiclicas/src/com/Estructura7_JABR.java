package com;

public class Estructura7_JABR {

	public static void main(String[] args) {
		/*7- Una persona desea invertir $700.00 en un banco, 
		 * el cual le otorga un 2% de interés mensual. 
		 * En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.
		 * 
		 */

		double capital = 700.00;
		double interes = 0.2;
		double total=0.0;
		int mes=0;
		
		while (total<1500.00) {
			total = total +(capital*interes);
			mes = mes +1;
		}
		
		
		System.out.println("El capitalfinal es de: "+total);
		System.out.println("Los meses que se invirtio son: "+mes);

	}

}