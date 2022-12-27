package comuno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Alumno al = new Alumno("Jayro","Lopez", "Lopez", "5to", 10);
		System.out.println(al.getNombre());
		System.out.println(al.getAm());
		System.out.println(al.getAp());
		System.out.println(al.getGrado());
		System.out.println(al.getEdad() );
		System.out.println(al);
		
		Profesor pro = new Profesor("Arturo","Matemeticas", "1er",10000, 40);
		System.out.println(pro);
		
		Materias mat = new Materias("Español", "esp", "3er" );
		System.out.println(mat);
		
		
		//Escuela esc = new  Escuela(al, mat, prof);
		//System.out.println(esc);
	}

}
