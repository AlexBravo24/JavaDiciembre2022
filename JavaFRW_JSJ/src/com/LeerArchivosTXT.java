package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivosTXT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//clase file permite leer o qrchivo q nosotros tengamos
		
		
		
		File f =new File("C:\\Users\\santi\\Documents\\Jayrosantillan.txt");
		String linea;
		
		
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader (fr);
			
			while((linea =br.readLine())!=null) {
				System.out.println(linea);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
