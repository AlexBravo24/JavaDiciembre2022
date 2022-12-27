package com;

public class Laptop {
String marca;
String precio;
String modelo;
String color;

Ram ram;
Almacenamiento almo;
Procesador cpu;
	
	
	public Laptop() {
		
	}


	public Laptop(String marca, String precio, String modelo, String color, Ram ram, Almacenamiento almo,
			Procesador cpu) {
	
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.color = color;
		this.ram = ram;
		this.almo = almo;
		this.cpu = cpu;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Ram getRam() {
		return ram;
	}


	public void setRam(Ram ram) {
		this.ram = ram;
	}


	public Almacenamiento getAlmo() {
		return almo;
	}


	public void setAlmo(Almacenamiento almo) {
		this.almo = almo;
	}


	public Procesador getCpu() {
		return cpu;
	}


	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}


	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color + ", ram="
				+ ram + ", almo=" + almo + ", cpu=" + cpu + "]";
	}
	
	
}
