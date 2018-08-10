package CASA.controlficheros.txts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import CASA.controlficheros.properties.LeerProperties;

public class LeerTXT {
	 
	  public static void main(String args[]) {
		String ficheroTXT=LeerProperties.LeerProp("RUTA_TXT");
		File file = new File(ficheroTXT+"fiche.txt");	
	     try {
	      FileReader fr = new FileReader(file);
	      BufferedReader br = new BufferedReader(fr);
	 
	      String linea;
	      while((linea = br.readLine()) != null)
	        System.out.println(linea);
	 
	      fr.close();
	    }
	    catch(Exception e) {
	      System.out.println("Excepcion leyendo fichero "+ file + ": " + e);
	    }
	  }
	

}
