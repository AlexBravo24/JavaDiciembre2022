package com;

public class Quesadilla {
	
//EL OBJETO SE IDENTIFICA POR SUS ATRIBUTOS
//LA MAYORIA DE LAS VECES TIENEN UN MODIFICADOR DE ACCESO PRIVATE
//TIENEN MODIFICADORES DE ACCESSO (PRIVATE Y PUBLIC) LOS CUALES PUEDES ACCEDERSE MEDIANTE GETTERS Y SETTERS
	
//PROTECTED - PUEDE COMPORTARSE COMO UN PUBLIC PERO MEDIANTE LA "HERENCIA"
	
/*UN MODIFICADOR DE ACCESO ES UN MECANISMO POR EL CUAL SE DELIMITA EL ACCESO Y VISIBILIDAD DE LOS ATRIBUTOS
DE UNA CLASE*/
	
	private String base;
	private String ingredienteP;
	public String salsa;
	protected String queso;
	String frijol;
	String aguacate;
	String papa;
	
/*EL MODIFICADOR "STATIC" PODEMOS CREAR VARIABLES QUE NO VAN A CAMBIAR, AUNQUE SI SE PUEDAN MODIFICAR DESDE LOS "SETTERS"
 * Y SI SE DESEA "NO" CAMBIAR, PODEMOS UTILIZAR UN MODIFICADOR FINAL, PARA CREAR UNA CONSTANTE O VALORES INMUTABLES.
 */
	private static final double precio=30;
	
//DECLARAMOS UN CONSTRUCTOR VACIO, EL CUAL SERVIRA COMO UN COMODIN O DUMMIE
	public Quesadilla() {
		
	}
	
	
	public Quesadilla(String base,String queso) {
		this.base=base;
		this.queso=queso;
//NO HAY LIMITES EN LA CANTIDAD DE CONSTRUCTORES QUE QUIERAMOS AGREGAR A UNA CLASE. SIEMPRE DEPENDERA DE LAS NECESIDADES.
		
	}	
	public Quesadilla(String base,String salsa,String ingredienteP) {
		this.base=base;
		this.salsa=salsa;
		this.ingredienteP=ingredienteP;
	
	}

//CONSTRUCTOR CON TODOS LOS PARAMETROS USANDO MENU
	public Quesadilla(String base, String ingredienteP, String salsa, String queso, String frijol, String aguacate,
			String papa) {
		super();
		this.base = base;
		this.ingredienteP = ingredienteP;
		this.salsa = salsa;
		this.queso = queso;
		this.frijol = frijol;
		this.aguacate = aguacate;
		this.papa = papa;
	}
//SETTER ESTABLECE UN VALOR EN EL ATRIBUTO ESPECIFICO
	public void setBase (String base)  {
		this.base=base;
	}
		
//GETTERS NOS DEVUELVE EL VALOR DEL ATRIBUTO
	public String getbase() {
		return this.base;
	}
	
	public String getIngredienteP() {
		return ingredienteP;
		
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


	public String getBase() {
		return base;
	}


	public static double getPrecio() {
		return precio;
	}


	public void setIngredienteP(String ingredienteP) {
		this.ingredienteP = ingredienteP;
	}

//SIRVE COMO UNA REFERENCIA O RADIOGRAFIA DE LOS ATRIBUTOS Y VALORES CON LOS QUE CUENTA EL OBJETO 
	@Override
	public String toString() {
		return "Quesadilla [base=" + base + ", ingredienteP=" + ingredienteP + ", salsa=" + salsa + ", queso=" + queso
				+ ", frijol=" + frijol + ", aguacate=" + aguacate + ", papa=" + papa + ",precio="+precio+"]";
	}


}



