package com;

public class Animal {
	
	//ATRIBUTOS
	
	private String especie;
	private String tamaño;
	private String tipo;
	private String nombre;
	private int peso;
	
	public Animal() {

	}

	public Animal(String especie, String tamaño, String tipo, String nombre, int peso) {
		super();
		this.especie = especie;
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", tamaño=" + tamaño + ", tipo=" + tipo + ", nombre=" + nombre + ", peso="
				+ peso + "]";
	}
	
	
	
}
