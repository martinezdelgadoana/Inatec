package especifico;
public class Loro extends Ave{
	public char region;
	public String color;
	
	public Loro(char sexo,int edad, char region,String color) {
		
		super(sexo,edad);
		
	}
	
	public void deDondeEres() {
	
		switch(this.region) {
			case 'N':
				System.out.println("Pajaro del norte");
				break;
			case 'S':
				System.out.println("Pajaro del sur");
				break;
			case 'O':
				System.out.println("Pajaro del oeste");
				break;
			case 'E':
				System.out.println("Pajaro del este");
				break;
			default:
				System.out.println("Region desconocida");
		}
	}
	
}
