package tp1ejercicio7;

public class Estudiante {
	private String nombre;
	private int legajo;
	private String email;
	
	
	public Estudiante(String nombre, int legajo, String email) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.email = email;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getLegajo() {
		return legajo;
	}


	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", legajo=" + legajo + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
}
