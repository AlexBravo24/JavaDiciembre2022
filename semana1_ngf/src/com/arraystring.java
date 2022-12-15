package com;

public class arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombres[] = {Alfredo, Maria, Rodrigo, Alberto};
		int edades[]= {30,20,15,45};
		
		int mayor= 0, menor = 0, imayor = 0, imenor;
		
		for (int i = 0; i<edades.length;i++) {
			
			if(edades[i]>mayor) {
				mayor - edades[i];
				imayor = 1;
				
			}
		}

		System.out.println("La persona de mayor edad es: "+nombres[imayor]+= +"con "+edades[imayor]);"
				
	}

}
