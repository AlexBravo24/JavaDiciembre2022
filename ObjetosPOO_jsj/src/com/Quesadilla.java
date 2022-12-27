package com;

public class Quesadilla {

	private String base;
	private String ingrediente;
	public String salsa;
	protected String queso;
	String papa;
	String aguacate;
	String cebolla;
	String frijol;
	private static final double precio=30;
	
	public Quesadilla() {
	}
	
	public Quesadilla(String base, String queso) {
		this.base=base;
		this.queso=base;
	}
	public Quesadilla(String base, String salsa, String ingrediente){
		this.base=base;
		this.salsa=salsa; 
		this.ingrediente=ingrediente;
	}

	public Quesadilla(String base, String ingrediente, String salsa, String queso, String papa, String aguacate,
			String cebolla, String frijol) {
		
		this.base = base;
		this.ingrediente = ingrediente;
		this.salsa = salsa;
		this.queso = queso;
		this.papa = papa;
		this.aguacate = aguacate;
		this.cebolla = cebolla;
		this.frijol = frijol;
	}
// getter nos devuelve un valor del atributo
	public String getBase() {
		return base;
	}
////setter establece un valor en el atributo especifico
	public void setBase(String base) {
		this.base = base;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public String getQueso() {
		return queso;
	}

	public void setQueso(String queso) {
		this.queso = queso;
	}

	public String getPapa() {
		return papa;
	}

	public void setPapa(String papa) {
		this.papa = papa;
	}

	public String getAguacate() {
		return aguacate;
	}

	public void setAguacate(String aguacate) {
		this.aguacate = aguacate;
	}

	public String getCebolla() {
		return cebolla;
	}

	public void setCebolla(String cebolla) {
		this.cebolla = cebolla;
	}

	public String getFrijol() {
		return frijol;
	}

	public void setFrijol(String frijol) {
		this.frijol = frijol;
	}

	public static double getPrecio() {
		return precio;
	}
   //sirbe como una referencia de los valores q cuenta el objeto
	@Override
	public String toString() {
		return "Quesadilla [base=" + base + ", ingrediente=" + ingrediente + ", salsa=" + salsa + ", queso=" + queso
				+ ", papa=" + papa + ", aguacate=" + aguacate + ", cebolla=" + cebolla + ", frijol=" + frijol + ", precio=" + precio + "]";
	}
	
	
	
	
}
