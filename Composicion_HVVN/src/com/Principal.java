package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RAM ram = new RAM (16, "Adata", 2166, "DDR4");
		Almacenamiento almc = new Almacenamiento("SSD",1024,"Kingston");
		Procesador cpu = new Procesador ("AMD","Ryzen 7",16,3.5);
		
		Laptop lap = new Laptop ("ROG","20,000","A1SJK12","Negra",ram,almc,cpu);
		
		System.out.println(lap);
		
	}
	
	//  Realizar otra composicion de algun objeto 

}
