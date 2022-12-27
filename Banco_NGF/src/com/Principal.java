package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CREAR LAS BASES DE DATOS DE LAS CUANTAS
		
		HashMap<String, Cuenta> cuentas=new HashMap<String, Cuenta>();
		
		cuentas.put("Juan", new Cuenta("001", 3000, "9685", 500, 20000, "Debito"));
		cuentas.put("Pedro", new Cuenta("002", 1000, "4363", 100, 30000, "Credito"));
		cuentas.put("Luis", new Cuenta("003", 500, "1213", 1500, 10000, "Debito"));
		cuentas.put("Marco", new Cuenta("004", 4000, "9988", 1500, 20000, "Debito"));
		cuentas.put("Lucy", new Cuenta("005", 200, "7654", 500, 10000, "Debito"));	
		
		Cajero cajero1=new Cajero("Integrantes, CDMX", cuentas);
		
//		//CONSULTAR INFORMACION DE UNA CUENTA QUE NO EXISTE
//		System.out.println(cajero1.buscarCuenta("Lalo"));
//		
//		//CONSULTAR INFORMACION DE UNA CUENTA QUE SI EXISTE
//		System.out.println(cajero1.buscarCuenta("Lucy"));
//	
		
//		//RETIRO DE CUENTA, INCREMENTO CONSECUTIVO EN FOLIO CON SEGUNDA OPERACION Y MENSAJE DE ERROR EN MINIMO DE CUENTA
//		System.out.println(cajero1.retirar("Marco", 1000));
//		System.out.println(cajero1.retirar("Marco", 1000));
//		System.out.println(cajero1.retirar("Marco", 1000));
//		
//		//DEPOSITO
//		System.out.println(cajero1.depositar("Marco",16000));
//		
	 	//TRANSFERENCIA
		
		System.out.println(cajero1.transferir("Pedro", "Luis", 200));
		System.out.println(cajero1.buscarCuenta("Luis"));
		
	
	}

}
