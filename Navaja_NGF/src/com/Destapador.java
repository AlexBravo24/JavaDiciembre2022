package com;

public class Destapador {
	
	String tipo;
	String material;
	int tamaño;
	
	public Destapador() {
		
	}

	public Destapador(String tipo, String material, int tamaño) {
		super();
		this.tipo = tipo;
		this.material = material;
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Destapador [tipo=" + tipo + ", material=" + material + ", tamaño=" + tamaño + "]";
	}
	
	
}
