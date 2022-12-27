package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// Crear la base de datos cuentas
		
		HashMap<String, Cuenta> cuentas= new HashMap<String, Cuenta>();
		
		cuentas.put("Juan", new Cuenta("001", 3000, "9685", 500, 20000, "Debito"));
		cuentas.put("Laura", new Cuenta("002", 1000, "4363", 100, 30000, "Debito"));
		cuentas.put("Ana", new Cuenta("003", 500, "1213", 50, 15000, "Debito"));
		cuentas.put("Joel", new Cuenta("004", 4000, "9988", 1500, 20000, "Debito"));
		cuentas.put("Pablo", new Cuenta("005", 200, "7654", 500, 10000, "Debito"));
		
		Cajero cajero1 = new Cajero("Insurgentes, CDMX ", cuentas);
		
		//consultar informacion de una cuenta
		
		// System.out.println(cajero1.buscarCuenta("Joel"));
		
		//retiro de cuenta, incremento consecutivo en folio con segunda operacion y
		//mensaje de error de minimo de cuenta
//		System.out.println(cajero1.retirar("Joel", 1000));
//		System.out.println(cajero1.retirar("Joel", 1000));
//		System.out.println(cajero1.retirar("Joel", 1000));
		
		//Deposito
//		System.out.println(cajero1.depositar("Joel", 16000));
		
		//Transferencia
		System.out.println(cajero1.transferir("Joel", "Pablo", 2000));
		System.out.println(cajero1.buscarCuenta("Pablo"));

	}

}
