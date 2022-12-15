package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//				ClaseA o1 = new ClaseA(5, "cinco");		
//				o1.primerMetodo();
//				o1.metodoOriginal();
		//	
//				ClaseB o2 = new ClaseB();
//				o2.primerMetodo();
//				o2.metodoOriginal();				
				
				persona persona1 = new persona("Mario", "M", 15);
				
				System.out.println(persona1.getNombre());
				System.out.println(persona1.getEdad());
				
				
				Profesionista prof = new Profesionista("Gloria", "F", 20, "Diseñador", "Lic en Artes Visuales", "GERG$%&");
				System.out.println(prof.getNombre());
				System.out.println(prof.getCarrera());
				//System.out.println(persona1.getCedula());
				
				System.out.println(prof);
				
				
				
				
				
				
				
				
			}

		}
		
	}

}
