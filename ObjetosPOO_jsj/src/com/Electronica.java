package com;

public class Electronica {
	
	private String tipo;
	private String Marca;
	private String modelo;
	private String Tamaño;
	private double Precio;
	
	
	public Electronica() {
		
	}


	public Electronica(String tipo, String marca, String modelo, String tamaño, double precio) {
		super();
		this.tipo = tipo;
		Marca = marca;
		this.modelo = modelo;
		Tamaño = tamaño;
		Precio = precio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getTamaño() {
		return Tamaño;
	}


	public void setTamaño(String tamaño) {
		Tamaño = tamaño;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}


	@Override
	public String toString() {
		return "Electronica [tipo=" + tipo + ", Marca=" + Marca + ", modelo=" + modelo + ", Tamaño=" + Tamaño
				+ ", Precio=" + Precio + "]";
	}
	
	
    
}
