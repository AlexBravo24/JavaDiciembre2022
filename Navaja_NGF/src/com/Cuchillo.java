package com;

public class Cuchillo {
	
	String hoja;
	String mango;
	String Punta;
	
	public Cuchillo () {
		
	}

	public Cuchillo(String hoja, String mango, String punta) {
		super();
		this.hoja = hoja;
		this.mango = mango;
		Punta = punta;
	}

	public String getHoja() {
		return hoja;
	}

	public void setHoja(String hoja) {
		this.hoja = hoja;
	}

	public String getMango() {
		return mango;
	}

	public void setMango(String mango) {
		this.mango = mango;
	}

	public String getPunta() {
		return Punta;
	}

	public void setPunta(String punta) {
		Punta = punta;
	}

	@Override
	public String toString() {
		return "Cuchillo [hoja=" + hoja + ", mango=" + mango + ", Punta=" + Punta + "]";
	}
	
	
	
}
