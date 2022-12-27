package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//crear la base de datos de las cuentas
		
		HashMap<String, Cuenta> cuentas= new HashMap<String, Cuenta>();
		//creacion de BD
		
		cuentas.put("Juan", new Cuenta("001",3000,"9685", 500, 20000, "Debito"));
		cuentas.put("Laura", new Cuenta("002",1000,"4363", 100, 3000, "Debito"));
		cuentas.put("Ana", new Cuenta("003",500,"1213", 50, 15000, "Debito"));
		cuentas.put("Joel", new Cuenta("004",4000,"9988", 1500, 20000, "Debito"));
		cuentas.put("Pablo", new Cuenta("005",200,"7654", 500, 10000, "Debito"));
		
		Cajero cajero1= new Cajero("Insurgentes, cdmx", cuentas);
		//consultar informacion de una  q no exista
		
//		System.out.println(cajero1.buscarCuenta("cesar"));
//		
//		//consultar una cuenta q si existe
//		System.out.println(cajero1.buscarCuenta("Juan"));
//		//consulta otra cuenta
//		System.out.println(cajero1.buscarCuenta("Joel"));
//		
//		//realizar un retiro
//		//mesaje de error con minimo de cuenta
//		System.out.println(cajero1.retirar("Joel", 1000));
//		System.out.println(cajero1.retirar("Joel", 1000));
//		System.out.println(cajero1.retirar("Joel", 1000));
		
		//metodo de depositar
		
//		System.out.println(cajero1.depositar("Joel", 17000));//no se puede exede el maximo de cuenta
//		System.out.println(cajero1.depositar("Joel", 16000));//llega al limite de la suma maxima
		
		
		//metodo transferir
		
		System.out.println(cajero1.transferir("Joel", "Pablo", 2000));//se transfiere de joel a pablo
		System.out.println(cajero1.buscarCuenta("Pablo"));//se actualiza el monto a pablo
		
		
	
	}

}
