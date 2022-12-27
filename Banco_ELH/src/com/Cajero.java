package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero {

	private String ubicacion;
	private int folio=0;
	
	//HashMap es una coleccion de datos que funciona como una "tabla" y nos va  apermitir identificar
	//con una "llave" un objeto(String, cuenta)(key,value)
	
	private HashMap<String, Cuenta> cuentas;

	public Cajero(String ubicacion, HashMap<String, Cuenta> cuentas) {
		this.ubicacion = ubicacion;
		this.cuentas = cuentas;
	}
	
	
	//Acciones
	
	
	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta=null;
		
		//Busca dentro del conjunto del HashMap
		for(String key: this.cuentas.keySet()) {//forEach para cada valor que encuentre contenida en hasmap haga la iteracion
			if(key.equals(nombreCliente)) {
				cuenta=this.cuentas.get(key);
				break;
			}
			
		}
		return cuenta;	
	}
	
	public Ticket retirar (String nombreCliente, double monto) {
		Ticket ticket =null;
		if(this.buscarCuenta(nombreCliente)!= null) {
			Cuenta cuenta=this.buscarCuenta(nombreCliente);
			if (monto>8000) {
				System.out.println("El monto excede el maxmo para retiros");
				return ticket;
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("Fondos insuficientes");
				return ticket;
			}else if(cuenta.getSaldo()-monto<cuenta.getMin()) {
				System.out.println("El retiro deja por debajo el minimo de la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumCuenta(),
						cuenta.getSaldo(), this.ubicacion, 1);
			}
		
		}else {
			System.out.println("No hay una cuenta asociada");
			return ticket;
		}
		
		return ticket;
	}
	
	public Ticket depositar (String nombreCliente, double monto) {
		Ticket ticket = null;
		if(this.buscarCuenta(nombreCliente)!= null) {
			Cuenta cuenta=this.buscarCuenta(nombreCliente);
			if(cuenta.getMax()<monto) {
				System.out.println("El monto excede el maximo permitido en la cuenta");
				return ticket;
			}else if(cuenta.getSaldo()+monto>cuenta.getMax()) {
				System.out.println("El doposito excede el maximo permitido de la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumCuenta(),
						cuenta.getSaldo(),this.ubicacion,1);
				return ticket;
			} 
		
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}			
	}
	
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		Ticket ticket = null;
		if(this.buscarCuenta(clienteOrigen)!= null && this.buscarCuenta(clienteDestino)!=null){
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);	
			if(origen.getSaldo()<monto) {
				System.out.println("Fondos insufucientes");
				return ticket;
			}else if((origen.getSaldo()-monto)<origen.getMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta origen");
				return ticket;
			}else if(destino.getMax()<monto) {
				System.out.println("El monto excede el maximo permitido en la cuenta");
				return ticket;
			}else if(destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("El deposito excede el maximo permitido de la cuenta");
				return ticket;
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket (folio++, new Date(), origen.getNumCuenta(),
						origen.getSaldo(), this.ubicacion,1);
				return ticket;
			}
		} else {
			System.out.println("Alguno de los clientes no tiene cuentas asociadas");
			return ticket;
		}
		
			
		
	}
	
}	

