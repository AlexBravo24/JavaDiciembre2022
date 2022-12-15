package com;

import java.util.Scanner;

public class Ejercicio11_NGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
de la entrega.
*/

		float peso;
		int zona = 0;
		float costototal;
		char z = 0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa el peso del paquete:  ");
		peso =sc.nextFloat();
		
		if (peso>5) {
		
			System.out.println("Su paquete EXCEDE el peso permitido, NO puede ser enviado  ");
			
		}else if (peso<=5) {
			
		System.out.println("NUMEROS DE ZONA DE ENVIO ");
		System.out.println("1 AMERICA DEL NORTE, 2 AMERICA CENTRAL, 3 AMERICA DEL SUR, 4 EUROPA, 5 ASIA");
		
		System.out.println("Ingresa la zona del envio: ");
		zona =sc.nextInt();
		//z = zona.charAt(0);
		
		System.out.println("Ingresa el peso del paquete:  ");
		peso =sc.nextFloat();
			
		
			
			switch (zona) {  
			
			case 1:
						costototal= peso*2400;
						System.out.println("Costo total del envio es:"+costototal);
						break;
            case 2:
            			costototal= peso*2000;
            			System.out.println("Costo total del envio es:"+costototal);
            			break;
            case 3:			
            			costototal= peso*2100;
            			System.out.println("Costo total del envio es:"+costototal);
            			break;
            case 4: 
            			costototal= peso*1000;
            			System.out.println("Costo total del envio es:"+costototal);
            			break;            			
            case 5: 
    					costototal= peso*1800;
    					System.out.println("Costo total del envio es:"+costototal);
    					break;
                          
            default:
    			        System.out.println("Datos Incorrectos");
			
}
		}
	}
}	
		
		
		
