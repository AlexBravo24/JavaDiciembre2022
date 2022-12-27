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
	public String toString() {
		return "Cientifica [celdasolar=" + celdasolar + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


	@Override
	public void suma(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void restar() {
		
		int a = 0 ;
		int b = 0;
		int resultado;
		Scanner entrada =new Scanner (System.in);
		System.out.println("Ingrese el primer valor");
		a=entrada.nextInt();
		System.out.println("Ingrese segundo valor ");
		b=entrada.nextInt();
		resultado= a-b;
		System.out.println("El resultado de la resta es = " +resultado);
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println(a/b);
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println(a*b);
		
	}

	
	//se sobre escriben los metodos de IMedicina con override
	//aqui podemos poner todo lo q queremos

	@Override
	public void tomarpresion() {
		// TODO Auto-generated method stub
		System.out.println("Presion alta");
	}


	@Override
	public void checartemperatura() {
		// TODO Auto-generated method stub
		System.out.println("Temperatura normal");
	}

	
}
