package com;

public class NavajaSuiza {
	
	String marca;
	Destornillador destor;
	Abrelatas abre;
	Cuchillo cuchi;
	Sacacorchos sacar;
	Destapador destap;
	
	public NavajaSuiza() {
		
	}

	public NavajaSuiza(String marca, Destornillador destor, Abrelatas abre, Cuchillo cuchi, Sacacorchos sacar,
			Destapador destap) {
		super();
		this.marca = marca;
		this.destor = destor;
		this.abre = abre;
		this.cuchi = cuchi;
		this.sacar = sacar;
		this.destap = destap;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Destornillador getDestor() {
		return destor;
	}

	public void setDestor(Destornillador destor) {
		this.destor = destor;
	}

	public Abrelatas getAbre() {
		return abre;
	}

	public void setAbre(Abrelatas abre) {
		this.abre = abre;
	}

	public Cuchillo getCuchi() {
		return cuchi;
	}

	public void setCuchi(Cuchillo cuchi) {
		this.cuchi = cuchi;
	}

	public Sacacorchos getSacar() {
		return sacar;
	}

	public void setSacar(Sacacorchos sacar) {
		this.sacar = sacar;
	}

	public Destapador getDestap() {
		return destap;
	}

	public void setDestap(Destapador destap) {
		this.destap = destap;
	}

	@Override
	public String toString() {
		return "NavajaSuiza [marca=" + marca + ", destor=" + destor + ", abre=" + abre + ", cuchi=" + cuchi + ", sacar="
				+ sacar + ", destap=" + destap + "]";
	}
}