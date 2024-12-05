package Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MostrarTemperaturasPorEncimaDe {

	public static void main(String[] args) {

		if (args.length != 3) {
			return;
		}

		String fichero = args[0];
		String municipio = args[1] + ":";
		int grados = Integer.valueOf(args[2]);

		File f = new File(fichero);

		if (f.canRead() && f.isFile() && f.exists()) {

			try {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String linea = "";

				while ((linea = br.readLine()) != null) {

					if (municipio.equalsIgnoreCase("Granada:")) {

						String[] palabras1 = linea.split("\\s+");

						if (palabras1[0].equalsIgnoreCase(municipio)) {

							linea = br.readLine();

							System.out.println("Dias en " + municipio + " que se superaron los " + grados + " grados");

							String[] palabras2 = linea.split(";");

							for (int i = 0; i < palabras2.length; i++) {

								if (Integer.valueOf(palabras2[i]) > grados) {

									System.out.print(palabras2[i] + " ");

								}

							}
							System.out.println();

						}

					} else if (municipio.equalsIgnoreCase("Churriana:")) {

						String[] palabras1 = linea.split("\\s+");

						if (palabras1[0].equalsIgnoreCase(municipio)) {

							linea = br.readLine();

							System.out.println("Dias en " + municipio + " que se superaron los " + grados + " grados");

							String[] palabras2 = linea.split(";");

							for (int i = 0; i < palabras2.length; i++) {

								if (Integer.valueOf(palabras2[i]) > grados) {

									System.out.print(palabras2[i] + " ");

								}

							}
							System.out.println();

						}

					} else if (municipio.equalsIgnoreCase("Maracena:")) {

						String[] palabras1 = linea.split("\\s+");

						if (palabras1[0].equalsIgnoreCase(municipio)) {

							linea = br.readLine();

							System.out.println("Dias en " + municipio + " que se superaron los " + grados + " grados");

							String[] palabras2 = linea.split(";");

							for (int i = 0; i < palabras2.length; i++) {

								if (Integer.valueOf(palabras2[i]) > grados) {

									System.out.print(palabras2[i] + " ");

								}

							}
							System.out.println();

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
