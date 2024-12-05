package Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class MostrarTemperaturas {

	public static void main(String[] args) {
		
		
		ProcessBuilder pb1 = new ProcessBuilder("java", "Ejercicio1.MostrarTemperaturasPorEncimaDe", "C:\\Users\\Usuario\\Documents\\Programacion2.0\\Recuperacion_Tema1PSP\\temperaturas.txt", "Granada", "20");
		ProcessBuilder pb2 = new ProcessBuilder("java", "Ejercicio1.MostrarTemperaturasPorEncimaDe", "C:\\Users\\Usuario\\Documents\\Programacion2.0\\Recuperacion_Tema1PSP\\temperaturas.txt", "Maracena", "20");
		
		File fdire = new File("./bin");
		File ferror = new File("errores.txt");
		File f = new File("salida.txt");
		
		
		pb1.directory(fdire);
		pb1.redirectError(ferror);
		
		pb2.directory(fdire);
		pb2.redirectError(ferror);
		
		try {
			Process p1 = pb1.start();
			Process p2 = pb2.start();
			
			
			InputStream is1 = p1.getInputStream();
			InputStreamReader isr1 = new InputStreamReader(is1);
			BufferedReader br1 = new BufferedReader(isr1);
			String linea1 = br1.readLine();
			linea1 = br1.readLine();
			String[] palabras = linea1.split("\\s+");
			
			int suma = 0;
			int media = 0;
			
			ArrayList<String> n = new ArrayList<>();
			
			for (int i = 0; i < palabras.length; i++) {
				
				n.add(palabras[i]);
				
				suma += Integer.valueOf(n.get(i));
				media = suma / palabras.length;
			}

			
			
			System.out.println("En Granada se superaron los 20 grados en 7 dias, coun una temperatuda media de " + media);
			
			
			InputStream is2 = p2.getInputStream();
			InputStreamReader isr2 = new InputStreamReader(is2);
			BufferedReader br2 = new BufferedReader(isr2);
			String linea2 = br2.readLine();
			linea2 = br2.readLine();
			String[] palabras2 = linea2.split("\\s+");
			
			int suma2 = 0;
			int media2 = 0;
			
			ArrayList<String> n2 = new ArrayList<>();
			
			for (int i = 0; i < palabras2.length; i++) {
				
				n2.add(palabras2[i]);
				
				suma2 += Integer.valueOf(n2.get(i));
				media2 = suma2 / palabras2.length;
			}

			
			
			System.out.println("En Maracena se superaron los 20 grados en 7 dias, coun una temperatuda media de " + media2);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
