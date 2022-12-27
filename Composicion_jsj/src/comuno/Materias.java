package comuno;

public class Materias {
	
	public String describcion;
	public String codigo;             //con modificadores de acceso
	public String grado;
	

	public Materias() {
		
	}


	public Materias(String describcion, String codigo, String grado) {
		super();
		this.describcion = describcion;
		this.codigo = codigo;
		this.grado = grado;
	}


	public String getDescribcion() {
		return describcion;
	}


	public void setDescribcion(String describcion) {
		this.describcion = describcion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getGrado() {
		return grado;
	}


	public void setGrado(String grado) {
		this.grado = grado;
	}


	@Override
	public String toString() {
		return "Materias [describcion=" + describcion + ", codigo=" + codigo + ", grado=" + grado + "]";
	}
	
	
	
	
}
