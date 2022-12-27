package com;

public abstract class Calculadora {
	
	String marca;
	String modelo;


public Calculadora() {
	
}

public Calculadora(String marca, String modelo) {
	this.marca = marca;
	this.modelo = modelo;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

@Override
public String toString() {
	return "Calculadora [marca=" + marca + ", modelo=" + modelo + "]";
}

public abstract void sumar(int a, int b);

public abstract void restar();

public abstract void dividir(int a, int b);

public abstract void multiplicar(int a,int b);

}
