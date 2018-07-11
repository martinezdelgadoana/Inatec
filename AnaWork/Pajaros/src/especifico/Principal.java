package especifico;

public class Principal extends Ave {
	static int num_aves=0;
	public static void main(String[] args) {

		//Ave.mostrarNAves();
		Piolin pio=new Piolin('M', 15, 3);
		Loro l1=new Loro('F',3, 'N',"verde");		
		
		pio.quienSoy();
		l1.quienSoy();
		
		pio.altura();
		l1.deDondeEres();
		
		pio.tamanio=50;
		pio.altura();
		
		l1.region='S';
		l1.deDondeEres();
		
		System.out.println("NºAves  "+Ave.num_aves);
	}
}
