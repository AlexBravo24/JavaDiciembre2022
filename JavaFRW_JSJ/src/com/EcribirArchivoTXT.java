package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EcribirArchivoTXT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File f =  new File("C:\\Users\\santi\\Documents\\JayroSantillan.txt");
		String linea;
		FileReader fr;
		
		try {
			FileWriter fw =  new FileWriter(f);
			fw.write("Hola mundo desde un archivo txt"+"\n");
			fw.write("Jayro Santillan Juarez");
			fw.close();
			fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			
			while((linea= br.readLine())!=null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
