package CASA.controlficheros.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import CASA.controlficheros.properties.LeerProperties;

public class LeerCSV {
	 public static final String SEPARATOR=";";
	   public static final String QUOTE="\"";

	   public static void main(String[] args) {

	      BufferedReader br = null;
	      
	      try {
	    	 //File file = new File("src/ficheros/fichCreados/ficheCSV.csv");
	    	  
	    	 String ficheroCSV=LeerProperties.LeerProp("RUTA_CSV");
	    	 System.out.println("--->"+ficheroCSV);
	    	 File file = new File(ficheroCSV+"ficheCSV.csv");
	    	 
	         br =new BufferedReader(new FileReader(file));
	         String line = br.readLine();

	         while (null!=line) {
	            String [] fields = line.split(SEPARATOR);
	            System.out.println(Arrays.toString(fields));
	            
//	            System.out.println("fadsfasdfsf"+fields[0]);
//	            String campos=fields.toString();
//	            campos.split(",");
//	            System.out.println(campos.length());
	        
	            line = br.readLine();
	         }
	         
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      } finally {
	         if (null!=br) {
	            try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         }
	      }
	   }
	   
	   private static String[] removeTrailingQuotes(String[] fields) {

		      String result[] = new String[fields.length];

		      for (int i=0;i<result.length;i++){
		         result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
		      }
		      return result;
		   }
}
