package com;

public class Destornillador {
	
	String marca;
	int tamaño;
	String tipo;
	
	public Destornillador() {
	}

	public Destornillador(String marca, int tamaño, String tipo) {
		super();
		this.marca = marca;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Destornillador [marca=" + marca + ", tamaño=" + tamaño + ", tipo=" + tipo + "]";
	}
	
	
}

	