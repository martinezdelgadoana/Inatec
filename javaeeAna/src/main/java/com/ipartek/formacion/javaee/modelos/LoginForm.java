package com.ipartek.formacion.javaee.modelos;

public class LoginForm {
	private String nombre;
	private String password;
	
	private String mensajeError;

	public LoginForm(String nombre, String password, String mensajeError) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.mensajeError = mensajeError;
	}

	public LoginForm(String nombre, String password) {
		
		this(nombre, password, "");
		
	}

	public LoginForm() {
		this("", "", "");
	}
	@Override
	public String toString() {
		return "LoginForm [nombre=" + nombre + ", password=" + password + ", mensajeError=" + mensajeError + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre!=null)
			this.nombre = nombre;
		else
			System.out.println("Nombre vacio");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(nombre!=null)
			this.password = password;
		else
			System.out.println("password");
		
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
}
