package com.ipartek.formacion.ejemplo1;

public class Punto {

	private int x, y;

	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Punto(int xy){
		this(xy,xy); //coordenadas iguales.
	}
	
	public Punto(){
		this(1,1); //Llama al construcctor intx,inty pasandole los valores.
	}
	


	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public Object clone(){
		return new Punto(x,y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
