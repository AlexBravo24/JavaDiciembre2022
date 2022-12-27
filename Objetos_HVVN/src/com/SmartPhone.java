package com;

public class SmartPhone {
	//Atributos
	
	private String marca;
	private String modelo;
	private String camara;
	private int peso;
	
	
	//constructor vacio
	public SmartPhone () {
		
	}


	public SmartPhone(String marca, String modelo, String camara, int peso) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.camara = camara;
		this.peso = peso;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCamara() {
		return camara;
	}


	public void setCamara(String camara) {
		this.camara = camara;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "SmartPhone [marca=" + marca + ", modelo=" + modelo + ", camara=" + camara + ", peso=" + peso + "]";
	}
	

}
