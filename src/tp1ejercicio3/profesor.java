package tp1ejercicio3;

public class profesor {

	private String nombre;
	private String apellido;
	private String email;
	private String catedra;
	private String facultad;
	
	public profesor(String nom, String ape, String email, String catedra, String facultad) {
		this.nombre = nom;
		this.apellido = ape;
		this.email = email;
		this.catedra = catedra;
		this.facultad = facultad;	
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCatedra() {
		return catedra;
	}
	
	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	
	public String getFacultad() {
		return facultad;
	}
	
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	public String tusDatos() {
		return "Nombre y apellido :" + getNombre() + " " + getApellido() + "\n" + 
				"Catedra: " + getCatedra() + "\n" + "Email: " + getEmail() + "\n" 
				+ "Facultad: " + getFacultad();
	}	
	
	
}
