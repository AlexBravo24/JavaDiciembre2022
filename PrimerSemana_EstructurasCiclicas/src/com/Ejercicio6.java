package com;

public class Ejercicio6 {

	public static void main(String[] args) {
		// .- Una persona desea invertir $1000.00 en un banco, 
		//el cual le otorga un 2% de interés mensual. Cual será la cantidad
		//de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.
		
		float inversion =1000f;
	//	float rendimiento =(inversion*0.02f);
		
		
		for (int i=1;i<=12;i++) {
			inversion = inversion + (inversion* 0.02f);
			
		}
		System.out.println("Al cabo de 12 meses el saldo seria de: "+inversion);
	}

}
