package com;

public class Sacacorchos {
	
	String tipo;
	String mango;
	
	public Sacacorchos () {
		
	}

	public Sacacorchos(String tipo, String mango) {
		super();
		this.tipo = tipo;
		this.mango = mango;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMango() {
		return mango;
	}

	public void setMango(String mango) {
		this.mango = mango;
	}

	@Override
	public String toString() {
		return "Sacacorchos [tipo=" + tipo + ", mango=" + mango + "]";
	}

	
}
