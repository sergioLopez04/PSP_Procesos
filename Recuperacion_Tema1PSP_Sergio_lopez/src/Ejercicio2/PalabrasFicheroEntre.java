package Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PalabrasFicheroEntre {

	public static void main(String[] args) {
		
		
		if (args.length != 3) {
			return;
		}
		
		String fichero = args[0];
		int num1 = Integer.valueOf(args[1]);
		int num2 = Integer.valueOf(args[2]);

		File f = new File(fichero);

		if (f.canRead() && f.isFile() && f.exists()) {
			
			try {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				String linea = "";
				
				while((linea = br.readLine()) != null) {
					
					String[] pa = linea.split("\\s+");
					
					System.out.println("Palabras entre " + num1 + " y " + num2);
					for (int i = 0; i < pa.length; i++) {
						
						if(pa[i].length() >= num1 && pa[i].length() <= num2) {
							
							System.out.println(pa[i]);
							
							
						}
						
					}
					
					
					
					
				}
				
				
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		

	}

}
