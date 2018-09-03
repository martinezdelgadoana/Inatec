package a.webEjers.ejercicios.manejo_fichs_dirs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class BuscarCadenaEnFich {
	public static void main(String[] args) {
		Scanner entrada = null;
		String linea;
		int numeroDeLinea = 1;
		boolean contiene = false;
		Scanner sc = new Scanner(System.in);
		// Para seleccionar el archivo
		JFileChooser j = new JFileChooser();
		j.showOpenDialog(j);
		// Introducimos el texto a buscar
		System.out.print("Introduce texto a buscar: ");
		String texto = sc.nextLine();
		try {
			// guardamos el path del fichero en la variable ruta
			String ruta = j.getSelectedFile().getAbsolutePath();
			// creamos un objeto File asociado al fichero seleccionado
			File f = new File(ruta);
			// creamos un Scanner para leer el fichero
			entrada = new Scanner(f);
			// mostramos el nombre del fichero
			System.out.println("Archivo: " + f.getName());
			// mostramos el texto a buscar
			System.out.println("Texto a buscar: " + texto);

			while (entrada.hasNext()) { // mientras no se llegue al final del fichero
				linea = entrada.nextLine(); // se lee una l�nea
				if (linea.contains(texto)) { // si la l�nea contiene el texto buscado se muestra porpantalla
					System.out.println("Linea " + numeroDeLinea + ": " + linea);
					contiene = true;
				}
				numeroDeLinea++; // se incrementa el contador de l�neas
			}
			if (!contiene) { // si el archivo no contienen el texto se muestra un mensaje indic�ndolo
				System.out.println(texto + " no se ha encontrado en el archivo");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (NullPointerException e) {
			System.out.println(e.toString() + "No ha seleccionado ning�n archivo");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
			sc.close();
		}
	}

}
