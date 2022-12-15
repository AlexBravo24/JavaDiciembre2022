package com;

public class Arrays_Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma= 0;
		String [] letras = {"3","y","9","6","r","a","e"};
		
		for (int i=0;i<=letras.length;i++) {
			
			try{
				int num = Integer.valueOf(letras[i]);
				System.out.println("el valor num es: "+num);
				switch(num){
				case 1:
					System.out.println("uno");
					suma=suma +num;
					break;
				case 2:
					System.out.println("dos");
					suma=suma +num;
					break;
				case 3:
					System.out.println("tres");
					suma=suma +num;
					break;
				case 4:
					System.out.println("cuatro");
					suma=suma +num;
					break;
				case 5:
					System.out.println("cinco");
					suma=suma +num;
					break;
				case 6:
					System.out.println("seis");
					suma=suma +num;
					break;
				case 7:
					System.out.println("site");
					suma=suma +num;
					break;
				case 8:
					System.out.println("ocho");
					suma=suma +num;
					break;
				case 9:
					System.out.println("nueve");
					suma=suma +num;
					break;
				case 10:
					System.out.println("diez");
					suma=suma +num;
					break;
				default:
					System.out.println("");
			 }
				
	        }
	        catch (NumberFormatException ex){
	             System.out.println("Es string: "+letras[i]);
	        }
			System.out.println("La suma es: "+suma);
			
		}
		
	}

}