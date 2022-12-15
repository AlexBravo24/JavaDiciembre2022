package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Usuario\\Desktop\\ejemplo1.txt");
		String linea;
		FileReader fr;
		
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("Hola mundo desde un archivo txt" + "");
			fw.write("Nancy Garcia");
			fw.close();
			fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			
			//fr = new FileReader(f);
			//BufferedReader br = new BufferedReader(fr);
			
			while((linea= br.readLine())!=null) {
				System.out.println(linea);
				
			}
			//}
		} catch (IOException e) {
			// Todo Auto-generated
			
			e.printStackTrace();
		}
		
	}

}
