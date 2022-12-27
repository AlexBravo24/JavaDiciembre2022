package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero {

	// este nos va a permitir efectuar las funciones

	private String ubicacion;
	private int folio;

	// Hashmap es una coleccion de datos que funciona como una tabla de datos que no
	// lleva orden
	// con una "llave" un objeto (String, Cuenta) (key Valua)

	private HashMap<String, Cuenta> cuentas;

	public Cajero(String ubicacion, HashMap<String, Cuenta> cuentas) {
		this.ubicacion = ubicacion;
		this.cuentas = cuentas;
	}

	// Acciones

	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta = null; // Cuenta llama a variable cuenta que de inicio su valor es nulo

		// BUSCA DENTRO DEL CONJUNTO DE LLAVES DEL HashMap
		// La llave "NOMBRE" para ver que esa cuenta existe

		for (String key : this.cuentas.keySet()) { // para cada cuenta que encuentre en el HashMap haga la iteracion
			if (key.equals(nombreCliente)) {
				cuenta = this.cuentas.get(key);
				break;
			}
		}

		return cuenta;

	}

	// CREAMOS FUNCIONES DE RETIRAR, DEPOSITAR Y TRANSFERIR

	public Ticket retirar(String nombreCliente, double monto) {
		Ticket ticket = null;
		if (this.buscarCuenta(nombreCliente) != null) {
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			if (monto>8000) {
				System.out.println("MONTO ES MAYOR AL PERMITIDO PARA EFECTUAR EL RETIRO");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("FONDOS INSUFICIENTES");
				return ticket;
			}else if (cuenta.getSaldo()-monto<cuenta.getMin()) {
				System.out.println("EFECTUAR EL RETIRO DEJARIA POR DEBAJO DEL MINIMO A LA CUENTA");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(),this.ubicacion, 1);
				return ticket;
			}
					
		}else

	{
		System.out.println("NO HAY UNA CUENTA ASOCIADA A UN CLIENTE");
		return ticket;
	}
	
	
}
	public Ticket depositar (String nombreCliente, double monto) {
		Ticket ticket=null;	
		if (this.buscarCuenta(nombreCliente) != null) {
		Cuenta cuenta = this.buscarCuenta(nombreCliente);
		if(cuenta.getMax()<monto) {
			System.out.println("EL MONTO EXCEDE EL MAXIMO PERMITIDO ENLA CUENTA");
			return ticket;
		}else if(cuenta.getSaldo()+monto>cuenta.getMax()) {
			System.out.println("EL DEPOSITO EXCEDE EL MAXIMO PERMITIDO DE LA CUENTA");
			return ticket;
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);  
			ticket=new Ticket (folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.ubicacion, 1);
			return ticket;
		}
		}else {
			System.out.println("NO HAY UNA CUENTA ASOCIADA A ESTE CLIENTE");
			return ticket;
		
		}
			
		}
	public Ticket transferir (String clienteOrigen, String clienteDestino, double monto) {
		Ticket ticket=null; 
	if (this.buscarCuenta(clienteOrigen) != null && this.buscarCuenta(clienteDestino)!=null) {
		Cuenta origen=this.buscarCuenta(clienteOrigen);
		Cuenta destino =this.buscarCuenta(clienteDestino);
		if (origen.getSaldo()<monto) {
			System.out.println("FONDOS INSUFICIENTES");
			return ticket;
		}else if (origen.getSaldo()-monto<origen.getMin()) {
			System.out.println("EL RETIRO DEJARIA POR EL SALDO MINIMO PR¿ERMITIDO LA CUENTA");
		}else if (destino.getMax()<monto) {
			System.out.println("EL MONTO EXCEDE EL MAXIMO PERMITIDO POR LA CUENTA");
			return ticket;
		}else if (destino.getSaldo()+monto>destino.getMax()) {
			System.out.println("LA TRANSFERENCIA EXCEDE EL MAXIMO PERMITIDO POR LA CUENTA");
			return ticket;
		}else {
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			ticket=new Ticket(folio++, new Date(), origen.getNumcuenta(),origen.getSaldo(), this.ubicacion, 1);
			return ticket;
			
		}
		
	}else {
		System.out.println("ALGUNO DE LOS CLIENTES NO TIENE CUENTAS ASOCIADAS");
		return ticket;
	}
	return ticket;
}
}		
