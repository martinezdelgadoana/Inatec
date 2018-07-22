package CASA.controlficheros.txts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import CASA.controlficheros.properties.LeerProperties;



public class EscribirTXT {
	
	public static void main (String[] args){
		escribirFicheroTXT();
	}
	
	
	public static void escribirFicheroTXT() {
		BufferedWriter bw = null;
	    FileWriter fw = null;
	
	    try {
    	
	        String data = "tiritiriiriri\n";
	        //File file = new File("D:\\eWorkSpace\\ControlDeFicheros\\src\\ficheros\\fichCreados\\fiche.txt");
	    	String ficheroTXT=LeerProperties.LeerProp("RUTA_TXT");
			File file = new File(ficheroTXT+"fiche.txt");	
	    	
	    	if (!file.exists()) {
	            file.createNewFile();
	        }
	        // flag true, indica adjuntar información al archivo.
	        fw = new FileWriter(file.getAbsoluteFile(), true);
	        bw = new BufferedWriter(fw);
	        bw.write(data);
	        System.out.println("información agregada!");
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            //Cierra instancias de FileWriter y BufferedWriter
	            if (bw != null)
	                bw.close();
	            if (fw != null)
	                fw.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	}
}
