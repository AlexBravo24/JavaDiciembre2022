package comuno;

public class Alumno {
	
	public String Nombre;
	public String ap;
	public String am;
	public String grado;
	public int edad;                   //modificadores de acceso

	
	public Alumno() {
		
	}


	public Alumno(String nombre, String ap, String am, String grado, int edad) {
		Nombre = nombre;
		this.ap = ap;
		this.am = am;
		this.grado = grado;
		this.edad = edad;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getAp() {
		return ap;
	}


	public void setAp(String ap) {
		this.ap = ap;
	}


	public String getAm() {
		return am;
	}


	public void setAm(String am) {
		this.am = am;
	}


	public String getGrado() {
		return grado;
	}


	public void setGrado(String grado) {
		this.grado = grado;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Alumno [Nombre=" + Nombre + ", ap=" + ap + ", am=" + am + ", grado=" + grado + ", edad=" + edad + "]";
	}
	
	
	
}
