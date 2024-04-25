package arraylist;

public class empleador {

	private String nombre;
	private int edad;
	private double sueldo;
	
	
	public empleador(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	
	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene " + edad + " anios. Y un sueldo de " + sueldo; 
	}
	
	
	
	
	
}
