package com;

import java.util.Scanner;

public class Ejercicio13_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
		y el resto se invierte en la bolsa.
		Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		niños y el resto se invierte en la bolsa.
		La institución desea saber cuánto de dinero destinará a cada rubro anualmente */
		
		double monto, centro, comedor, bolsa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor ingrese la cantidad de la donacion ");
		monto = sc.nextDouble();
		
		if(monto>=10000) {
			centro = monto*0.30;
			comedor = monto *0.50;
			bolsa= monto-(centro+comedor);
			System.out.println("La cantidad destinada al centro de salud es de "+centro
					+" La cantidad destinada al comedor es de "+comedor
					+" y el restante que es de "+bolsa+" Es para invertir "
					);
			
		}else if(monto<10000) {
			centro = monto*0.25;
			comedor = monto *0.60;
			bolsa= monto-(centro+comedor);
			System.out.println("La cantidad destinada al centro de salud es de "+centro
					+" La cantidad destinada al comedor es de "+comedor
					+" y el restante que es de "+bolsa+" Es para invertir "
					);
		}else {
			System.out.println("Error");
		}

	}

}
