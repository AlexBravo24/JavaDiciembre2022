package com;

public class bancointeres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double monto = 700; 
		int	nm=0;
		
		while(monto<1500) {
			
			nm++;
			monto = monto + monto*.02;
		}

		System.out.println("Para obtener un monto mayor a 1500 pesos pasaron "+nm+" meses");
	}

}
