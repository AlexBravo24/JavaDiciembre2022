package com;

public class Interesbanco_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad
//		de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.
		
		
		double montoi=1000;
		double interes=0.02;
		

		for (int i=1; i<13;i++) {
			
			montoi=montoi + (montoi*interes);
			System.out.println(montoi);
		}
		System.out.println("El monto total, recibido en un año ser de: "+montoi);
		System.out.printf("%.2f",montoi);
		
		
	}

}
