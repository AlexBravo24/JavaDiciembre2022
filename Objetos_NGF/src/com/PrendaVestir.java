package com;

public class PrendaVestir {
	
	//ATRIBUTOS
	
	private String Tipo;
	private String Talla;
	private String Color;
	private int precio;
	private int cantidad;
	
	public PrendaVestir() {
	
	}

	public PrendaVestir(String tipo, String talla, String color, int precio, int cantidad) {
		super();
		Tipo = tipo;
		Talla = talla;
		Color = color;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getTalla() {
		return Talla;
	}

	public void setTalla(String talla) {
		Talla = talla;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "PrendaVestir [Tipo=" + Tipo + ", Talla=" + Talla + ", Color=" + Color + ", precio=" + precio
				+ ", cantidad=" + cantidad + "]";
	}
	
	}
