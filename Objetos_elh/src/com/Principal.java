package com;

public class Principal {

	public static void main(String[] args) {
		
		/*Llamar al objeto y establecer el valor del atributo*/
		
		Quesadilla quesadilla1 = new Quesadilla();
		quesadilla1.setSalsa("Roja");
		quesadilla1.setBase("Maiz");
		
		
		//imprimir en la pantalla la composicion de dicho objeto
		System.out.println(quesadilla1);
		
		Quesadilla q2 = new Quesadilla("", null, null, null, null, null, null, null);
		System.out.println(q2);
		
		Animal a1=new Animal();
		a1.setEspecie("Perro");
		a1.setPeso(15);
		a1.setNombre("Firulais");
		a1.setTipo("Terrestre");
		a1.setTamaño("Mediano");
		
		System.out.println(a1);
		
		
	}
	
}
