package com;

public class Principal {

	public static void main(String[] args) {
		
//ASIGNO E IMPRIMO LA COMPOSICION DE CADA ATRIBUTO QUE YO QUIERA SELECCIONAR, EN ESTE CASO SOLO ESTABLEZCO DE 2 ATRIBUTOS
		
		Quesadilla quesadilla1=new Quesadilla();
		quesadilla1.setSalsa("Roja");
		quesadilla1.setBase("Maiz");
		
		System.out.println(quesadilla1);
		
//IMPRIMO EN PANTALLA LA COMPOSICION DE DICHO OBJETO,ATRIBUTO POR ATRIBUTO		
		Quesadilla q2=new Quesadilla ("Harina","Bistec","Verde","oaxaca","no","Si","no");
		System.out.println(q2);
	
		
		Quesadilla quesadilla3=new Quesadilla();
		quesadilla3.setIngredienteP("Hongos");
		quesadilla3.setAguacate("no");
		
		System.out.println(quesadilla3);
		
		Animal a1=new Animal();
		a1.setEspecie("Perro");
		a1.setNombre("Firulais");
		a1.setTipo("Terrestre");
		a1.setTamaño("Mediano");
		a1.setPeso(15);
		
		System.out.println(a1);
		
		PrendaVestir r1=new PrendaVestir();
		r1.setTipo("Vestido");
		r1.setTalla("MEdiano");
		r1.setColor("ROJO");
		r1.setCantidad(2);
		r1.setPrecio(100);
		
		System.out.println(r1);
		
	}

}
