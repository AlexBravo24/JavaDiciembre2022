package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EN ESTA CLASE PRINCIPAL LLAMO A LA CLASE RAM, ALMACENAMIENTO, PROCESADOR Y LAPTOP,  
		//LE ASIGNO LOS DATOS A CADA ATRIBUTO DE CADA OBJETO DECLARADO
		//LOS ASIGNO MEDIANTE POSICION DE COMO LO DECLARE EN CADA CLASE , NO POR SETTERS.
		
		RAM ram = new RAM(16,"Adata",2166,"DDR4");
		Almacenamiento almc = new Almacenamiento ("SSD",1024,"KINGSTON");
		Procesador cpu = new Procesador ("AMD","Ryzen 7", 16,3.5);
		
		Laptop lap = new Laptop ("IENOVO", "13,000","M5","GRIS", ram, almc, cpu);
		
		
		System.out.println(lap);
		

	}

}
