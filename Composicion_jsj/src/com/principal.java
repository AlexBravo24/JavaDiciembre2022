package com;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ram ram = new Ram(16,"Aldea", 2116,"DDR4");
		Almacenamiento almc = new Almacenamiento("SSD",1024,"Kingston");
		Procesador cpu= new Procesador("AMD","Ryzen",16,3.5);
		Laptop lap = new Laptop("ROG","20000","AKJNJ1","Negra", ram, almc, cpu);
	
		System.out.println(lap);
	// realizar una compocicion  con por ejemplo una navaja suiza	
	}

}
