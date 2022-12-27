package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero {
	
	private String ubicacion;
	private int folio=0;
	
	// HasMap es una coleccion de datos que funciona como una tabla y nos va a permitir 
	// identificar con una "llave" un objeto (string cuenta)=(key value)
	
	private HashMap<String, Cuenta> cuentas;

	public Cajero(String ubicacion, HashMap<String, Cuenta> cuentas) {
		this.ubicacion = ubicacion;
		this.cuentas = cuentas;
	}
	
	// Acciones
	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta =null;
		
		//Buscar dentro del conjunto de llaves del HasMap
		for (String key: this.cuentas.keySet()) {  // ForEach para cada cuenta
			if (key.equals(nombreCliente)) {
				cuenta=this.cuentas.get(key);
				break;
			}
		}
		return cuenta;
		
	}
	// Creamos funciones de retirar, depositar y transferir
	
	public Ticket retirar (String nombreCliente, double monto) {
		Ticket ticket=null;
		if (this.buscarCuenta(nombreCliente)!=null) {
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			if (monto>8000) {
				System.out.println("El monto excede el maximo permitido");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("Fondos insuficientes");
				return ticket;
			}else if (cuenta.getSaldo()-monto<cuenta.getMin()) {
					System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
					return ticket;
				
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket (folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.ubicacion, 1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a este cliente ");
			return ticket;
		}
		
	}
	
	public Ticket depositar (String nombreCliente, double monto) {
		Ticket ticket=null;
		if (this.buscarCuenta(nombreCliente)!=null) {
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			if(cuenta.getMax()<monto) {
				System.out.println("El monto excede el maximo permitiddo en la cuenta");
				return ticket;
			}else if (cuenta.getSaldo()+monto>cuenta.getMax()) {
				System.out.println("El deposito excede el maximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket (folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.ubicacion, 1);
				return ticket;
				
			}
	}else {
		System.out.println("No hay una cuenta asociada a este cliente");
		return ticket;
	}
	}
		public Ticket transferir (String clienteOrigen, String clienteDestino, double monto) {
			Ticket ticket=null;
			if (this.buscarCuenta(clienteOrigen)!=null && this.buscarCuenta(clienteDestino)!=null) {
				Cuenta origen = this.buscarCuenta(clienteOrigen);
				Cuenta destino = this.buscarCuenta(clienteDestino);
				if (origen.getSaldo()<monto) {
					System.out.println("Fondos insuficientes");
					return ticket;
				}else if (origen.getSaldo()-monto<origen.getMin()) {
					System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
					return ticket;
				}else if (destino.getMax()<monto) {
					System.out.println("El monto excede el maximo permitido por la cuenta ");
					return ticket;
				}else if (destino.getSaldo()+monto>destino.getMax()) {
					System.out.println("La transferencia excede el maximo permitido por la cuenta ");
					return ticket;
				}else {
					origen.setSaldo(origen.getSaldo()-monto);
					destino.setSaldo(destino.getSaldo()+monto);
					ticket = new Ticket(folio++, new Date(), origen.getNumcuenta(), origen.getSaldo(), this.ubicacion,1);
					return ticket;
					
				}
				
			}else {
				System.out.println("Alguno de los clientes no tiene cuentas asociadas ");
				return ticket;
				
			}
			
		}
		
}
	

