package otrosEjemplos;
public class PruebaConsola
{
	public static void main(String[] argumentos) {
		//System.console().readLine() s�lo funciona en la consola real, no en la de Eclipse
		//S�lo existe a partir de Java6
		 
		System.out.print("Que saludo quieres: ");
		String saludo = System.console().readLine();
		System.out.println(saludo + " " + argumentos[0]);
	}
}