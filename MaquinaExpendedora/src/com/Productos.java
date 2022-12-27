package com;

public class Productos {
	
	private String nombre;
	private String claveP;
	private double precio;
	
	private Productos() {
		
	}

	public Productos(String nombre, String claveP, double precio) {
		super();
		this.nombre = nombre;
		this.claveP = claveP;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClaveP() {
		return claveP;
	}

	public void setClaveP(String claveP) {
		this.claveP = claveP;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", claveP=" + claveP + ", precio=" + precio + "]";
	}
	
	
	

}
