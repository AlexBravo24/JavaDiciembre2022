package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements IMedicina {
	
	boolean celdasolar;
	
	public Cientifica() {
		
	}
	
	

	public Cientifica(String marca, String modelo, boolean celdasolar) {
		super(marca, modelo);
		this.celdasolar = celdasolar;
	}



	@Override
	public void sumar(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void restar() {
		int a, b;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Imprime el primer valor ");
		a = entrada.nextInt();
		System.out.println("Imprime el segundo valor ");
		b = entrada.nextInt();
		System.out.println("El resultado de la resta es " + (a-b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println(a/b);
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println(a*b);
		
	}



	@Override
	public String toString() {
		return "Cientifica [celdasolar=" + celdasolar + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}



	@Override
	public void tomarpresion() {
	System.out.println("Presion alta ");
		
	}



	@Override
	public void checarTemperatura() {
		System.out.println("Temperatura normal ");
	
		
	}

}
