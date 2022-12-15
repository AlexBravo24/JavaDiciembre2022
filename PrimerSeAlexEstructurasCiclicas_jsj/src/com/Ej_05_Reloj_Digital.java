package com;

public class Ej_05_Reloj_Digital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas;
		int minutos;
		int segundo;

		
		for ( horas = 0; horas <= 23; horas++)
		
			for ( minutos = 0; minutos <= 59; minutos++)
			
				for ( segundo = 0; segundo <= 59; segundo++) {
					System.out.println(horas+":"+minutos+":"+segundo);
				
				}
		
	}

}
