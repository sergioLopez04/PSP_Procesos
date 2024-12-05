package Ejercicio2;

import java.io.File;
import java.io.IOException;

public class EstadisticasFichero {

	public static void main(String[] args) {
		
		ProcessBuilder pb1 = new ProcessBuilder("java", "Ejercicio2.PalabrasFicheroEntre", "C:\\Users\\Usuario\\Documents\\Programacion2.0\\Recuperacion_Tema1PSP\\fichero1.txt" ,"1", "4");
		ProcessBuilder pb2 = new ProcessBuilder("java", "Ejercicio2.PalabrasFicheroEntre", "C:\\Users\\Usuario\\Documents\\Programacion2.0\\Recuperacion_Tema1PSP\\fichero1.txt" ,"5", "8");
		
		
		
		File fdire = new File("./bin");
		File ferror = new File("ferror.txt");
		
		pb1.directory(fdire);
		pb1.redirectError(ferror);

		pb1.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		
		pb2.directory(fdire);
		pb2.redirectError(ferror);

		pb2.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		
		try {
			Process p1 = pb1.start();
			Process p2 = pb2.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
