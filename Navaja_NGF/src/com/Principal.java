package com;

public class Principal {

	public static void main(String[] args) {
		
		Abrelatas abre = new Abrelatas("Hamilton","Mariposa");
		Destornillador destor = new Destornillador("Pretul", 3,"Punt plana");
		Destapador destap = new Destapador("Plano", "Niquel",3);
		Cuchillo cuchi = new Cuchillo ("Acero inoxidable", "madera","Puntiagida");
		Sacacorchos sacar = new Sacacorchos("palanca","mango");
		NavajaSuiza navaja= new NavajaSuiza("Victorinox", destor, abre, cuchi, sacar, destap);
				
				
				System.out.println(navaja);
		
	}

}
