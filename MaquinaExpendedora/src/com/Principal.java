package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		HashMap<String, Productos> producto1 =new HashMap<String,Productos>() ;

		String codigo;
		double dinero;
		Scanner sc= new Scanner(System.in);
		
		Operaciones maquina = new Operaciones(producto1);
		
		producto1.put("A1", new Productos ("Gansito","Aa", 25));
		producto1.put("A2", new Productos ("chocotorro", "Ab", 23));
		producto1.put("A3", new Productos ("Principe", "Ac", 28));
		producto1.put("B1", new Productos ("Barratis", "Bd", 18));
		
		System.out.println("Ingrese el codigo del producto que sea comprar");
		codigo=sc.next();
		System.out.println("Por favaor ingrese la cantidad correspondiente ");
		dinero=sc.nextDouble();
		System.out.println(maquina.seleccionar(codigo, dinero));
		
		
		
		
		
		
	}

}
