package comuno;

public class Escuela {
	
	Alumno al;
	Materias mat;
	Profesor prof;

	
	public Escuela() {
		
	}


	public Escuela(Alumno al, Materias mat, Profesor prof) {
		
		this.al = al;
		this.mat = mat;
		this.prof = prof;
	}


	public Alumno getAl() {
		return al;
	}


	public void setAl(Alumno al) {
		this.al = al;
	}


	public Materias getMat() {
		return mat;
	}


	public void setMat(Materias mat) {
		this.mat = mat;
	}


	public Profesor getProf() {
		return prof;
	}


	public void setProf(Profesor prof) {
		this.prof = prof;
	}


	@Override
	public String toString() {
		return "Escuela [al=" + al + ", mat=" + mat + ", prof=" + prof + "]";
	}
	
	
}
