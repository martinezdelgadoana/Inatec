package com.ipartek.formacion.pajaros;


public class Principal extends Ave {
	static int num_aves=0;
	public static void main(String[] args) {

		//Ave.mostrarNAves();
		Piolin pio=new Piolin('M', 15, 3, 3);
		Loro l1=new Loro('F',3, 'N',"verde");		
		Canario c1=new Canario('V',12,50,35);
		
		pio.quienSoy();
		l1.quienSoy();
		
		pio.altura(pio);
		l1.deDondeEres();
		
		pio.tamanio=50;
		pio.altura(pio);
		
		pio.altura(100);
		
		l1.region='S';
		l1.deDondeEres();
		c1.altura(23);
		l1.setRegion('O');
		l1.deDondeEres();
		
	
		
		
		
		System.out.println("NºAves  "+Ave.num_aves);
	}
}
