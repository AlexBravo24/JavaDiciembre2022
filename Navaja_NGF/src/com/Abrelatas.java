package com;

public class Abrelatas {
	
	String Marca;
	String Tipo;
	
	public Abrelatas() {
		
	}

	public Abrelatas(String marca, String tipo) {
		super();
		Marca = marca;
		Tipo = tipo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return "Abrelatas [Marca=" + Marca + ", Tipo=" + Tipo + "]";
	}
	
	}
