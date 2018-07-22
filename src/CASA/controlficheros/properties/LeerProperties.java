package CASA.controlficheros.properties;


import java.io.FileReader;
import java.util.Properties;


public class LeerProperties {
	
	public static String RUTA_PROPERTIES="src/CASA/controlficheros/properties/config.properties";
	
	static String nombreProp;
	static String propRecibida;
	
	public static void main(String[] args) {		
		propRecibida=LeerProp("RUTA_CSV");
		System.out.println("propiedad  "+propRecibida);
	}
	
	public static String LeerProp(String propiedad){
		System.out.println(propiedad);
		Properties p = new Properties();
		try {
			p.load(new FileReader(RUTA_PROPERTIES));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p.getProperty(propiedad);
	}
}
