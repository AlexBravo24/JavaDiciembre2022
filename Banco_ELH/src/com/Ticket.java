package com;

import java.util.Date;

public class Ticket {

	private int folioOperacion;
	private Date fechaHora;
	private String numCuenta;
	private double saldo;
	private String ubicacion;
	private int idCajero;
	
	public Ticket() {
		
	}

	public Ticket(int folioOperacion, Date fechaHora, String numCuenta, double saldo, String ubicacion, int idCajero) {
		super();
		this.folioOperacion = folioOperacion;
		this.fechaHora = fechaHora;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.ubicacion = ubicacion;
		this.idCajero = idCajero;
	}

	public int getFolioOperacion() {
		return folioOperacion;
	}

	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folioOperacion=" + folioOperacion + ", fechaHora=" + fechaHora + ", numCuenta=" + numCuenta
				+ ", saldo=" + saldo + ", ubicacion=" + ubicacion + ", idCajero=" + idCajero + "]";
	}
	
	
	
	
}
