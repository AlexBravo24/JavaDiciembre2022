package com;

public class RAM {
	
	int capacidad;
	String fabricante;
	double frecuencia;
	String tipo;
	
	public RAM () {
		
	}

	public RAM(int capacidad, String fabricante, double frecuencia, String tipo) {
		this.capacidad = capacidad;
		this.fabricante = fabricante;
		this.frecuencia = frecuencia;
		this.tipo = tipo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "RAM [capacidad=" + capacidad + ", fabricante=" + fabricante + ", frecuencia=" + frecuencia + ", tipo="
				+ tipo + "]";
	}
	

}
