package com;

public class Quesadilla {
	
	//Atributos
	//La mayoría de veces tienen un modificador de acceso private
	
	/*Modificadores de acceso (public o private - los cuales pueden accederse por medio de getters y setters
	 * protected - puede comportarse como un public pero mediante la herencia)
	 * 
	 * Un modificador de acceso es un mecanismo por el cual se delimita el acceso y visibilidad de los atributos
	 * de una clase.
	 * 
	 */
	
	
	private String base;
	private String ingredienteP;
	public String salsa;
	protected String queso;
	String frijol;
	String aguacate;
	String papa;
	String cebolla;
	
	//El modificador Static podemos crear variables que no van a cambiar, aunque se si se pueden modificar desde los setters
	//Y si se desea no cambiar, podemos utilizar un modificador final, para crear constantes o valores inmutables
	private static final double precio = 30;
	
	
	//Constructor vacío - este constructor sirve como un comodín o dummie
	public Quesadilla() {
		
	}
	
	public Quesadilla (String base, String queso) {
		this.base=base;
		this.queso=queso;
	}
	
	public Quesadilla (String base, String salsa, String ingredienteP) {
		this.base=base;
		this.salsa=salsa;
		this.ingredienteP=ingredienteP;
	}
	
	//No hay limite en la cantidad de constrcutores que quieramos agregar a una clase. Siempre va a depender de las
	//necesidades
	
	
	//Constructor con todos los parámetros
	public Quesadilla(String base, String ingredienteP, String salsa, String queso, String frijol, String aguacate,
			String papa, String cebolla) {
		this.base = base;
		this.ingredienteP = ingredienteP;
		this.salsa = salsa;
		this.queso = queso;
		this.frijol = frijol;
		this.aguacate = aguacate;
		this.papa = papa;
		this.cebolla = cebolla;
	}

	//Setter - establece un valor en el atributo específico
	public void setBase (String base) {
		this.base=base;
	}
	//Getter - nos devuelve el valor del atributo
	public String getBase() {
		return this.base;
	}

	public String getIngredienteP() {
		return ingredienteP;
	}

	public void setIngredienteP(String ingredienteP) {
		this.ingredienteP = ingredienteP;
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

	public String getFrijol() {
		return frijol;
	}

	public void setFrijol(String frijol) {
		this.frijol = frijol;
	}

	public String getAguacate() {
		return aguacate;
	}

	public void setAguacate(String aguacate) {
		this.aguacate = aguacate;
	}

	public String getPapa() {
		return papa;
	}

	public void setPapa(String papa) {
		this.papa = papa;
	}

	public String getCebolla() {
		return cebolla;
	}

	public void setCebolla(String cebolla) {
		this.cebolla = cebolla;
	}

	public static double getPrecio() {
		return precio;
	}

	
	//Sirve como una referencia o radiografía de los atributos y valores con los que cuenta el objeto
	@Override
	public String toString() {
		return "Quesadilla [base=" + base + ", ingredienteP=" + ingredienteP + ", salsa=" + salsa + ", queso=" + queso
				+ ", frijol=" + frijol + ", aguacate=" + aguacate + ", papa=" + papa + ", cebolla=" + cebolla + "]";
	}
}



