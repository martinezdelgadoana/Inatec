package especifico;

public class Canario extends Ave{
	char sexo;
	int edad;
	public static Integer tamanio;// el tamaño (real).
	
	
	public Canario(char sexo,Integer edad) {
		super(sexo,edad);

		
	}
	public Canario(char sexo,int edad,Integer tamanio) {
		super(sexo,edad);
		this.tamanio=tamanio;
		
		
	}
	
	public static void altura() {
		
		if (tamanio != null) {
			if (tamanio > 30) {
				System.out.println("Alto");
			}else if(tamanio<15) {
				System.out.println("Bajo");
				
			}else {
				System.out.println("Mediano");
			}
		}else {
			System.out.println("El canario no tiene tamanio");
		}
	}
}
