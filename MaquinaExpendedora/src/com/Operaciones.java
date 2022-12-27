package com;

import java.util.HashMap;

public class Operaciones {
	
	private HashMap<String, Productos> producto1;
	double cambio=0;
	
	
	public Operaciones(HashMap<String, Productos> producto1) {
		this.producto1=producto1;
	}
	
	//Acciones
	
	public Productos buscarProductos (String claveProd) {
		Productos producto = null;
		
		//buscar dentro del HashMap
		for(String key:this.producto1.keySet()) {
			if(key.equals(claveProd)) {
				producto=this.producto1.get(key);
				break;
			}
		}
		return producto;	
	}
	
	public Operaciones seleccionar(String claveProd, double monto){
		Operaciones  produ=null;
		if(this.buscarProductos(claveProd)!=null) {
			Productos prod = this.buscarProductos(claveProd);
		if(claveProd == prod.getClaveP() && monto < prod.getPrecio()) {
			System.out.println("El monto ingresado es menor al precio del producto");
		}else if(claveProd == prod.getClaveP() && monto == prod.getPrecio()) {
			System.out.println("El producto ha sido seleccionado y pagado correctamente");
		}else if(claveProd == prod.getClaveP() && monto > prod.getPrecio()) {
			cambio=monto-prod.getPrecio();
			System.out.println("El producto ha sido sellecionado y pagado correctamente su cambio es "+cambio);
		}if(claveProd != prod.getClaveP()) {
			System.out.println("La clave es incorrecta");
		}
		}
		return produ;
	}
	
	
}
