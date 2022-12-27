package comuno;

public class Profesor {
	
	public String nombre;
	public String materia;    //con sus modificadores de acceso
	public String grado;
	public double sueldo;
	public int edad;
	
	
	public Profesor() {
		
	}


	public Profesor(String nombre, String materia, String grado, double sueldo, int edad) {
		this.nombre = nombre;
		this.materia = materia;
		this.grado = grado;
		this.sueldo = sueldo;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public String getGrado() {
		return grado;
	}


	public void setGrado(String grado) {
		this.grado = grado;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", materia=" + materia + ", grado=" + grado + ", sueldo=" + sueldo
				+ ", edad=" + edad + "]";
	}
	
	

}
