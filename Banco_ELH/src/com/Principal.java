package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//crear la abse de datos de las cuentas 
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		
		cuentas.put("Juan", new Cuenta("001", 3000,"9685", 500, 20000,"Debito"));
		cuentas.put("Jayro", new Cuenta("002", 8000,"9685", 700, 40000,"Credito"));
		cuentas.put("Elisa", new Cuenta("003", 1000,"9685", 800, 60000,"Debito"));
		cuentas.put("Hugo", new Cuenta("004", 6000,"9685", 200, 10000,"Credito"));
		cuentas.put("Nancy", new Cuenta("005", 9000,"9685", 900, 12000,"Debito"));
		
		Cajero cajero1 = new Cajero("insurgentes",  cuentas);

		//consultar inf de una cuenta que no existe
		//System.out.println(cajero1.buscarCuenta("Cesar"));
	
		//consultar inf de una cuenta existente 
		System.out.println(cajero1.buscarCuenta("Elisa"));
	
		//retiro de cuenta
		System.out.println(cajero1.retirar("Juan", 3000));
	
		//depositar
		System.out.println(cajero1.depositar("Elisa",45000 ));
		System.out.println(cajero1.depositar("Elisa",3000 ));
	
		//transeferencia
		System.out.println(cajero1.transferir("Elisa", "Nancy", 2500));
		System.out.println(cajero1.buscarCuenta("Nancy"));
	
	}

}
 