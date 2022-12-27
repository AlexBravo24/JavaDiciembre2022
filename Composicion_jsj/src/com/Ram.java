package com;

public class Ram {

	int capacidad;
	String Frabricante;
	double frecuencia;
	String tipo;
	
	
	
	public Ram(){
		}



	public Ram(int capacidad, String frabricante, double frecuencia, String tipo) {
		
		this.capacidad = capacidad;
		Frabricante = frabricante;
		this.frecuencia = frecuencia;
		this.tipo = tipo;
	}



	public int getCapacidad() {
		return capacidad;
	}



	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	public String getFrabricante() {
		return Frabricante;
	}



	public void setFrabricante(String frabricante) {
		Frabricante = frabricante;
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
		return "Ram [capacidad=" + capacidad + ", Frabricante=" + Frabricante + ", frecuencia=" + frecuencia + ", tipo="
				+ tipo + "]";
	}
	
	
	
}
