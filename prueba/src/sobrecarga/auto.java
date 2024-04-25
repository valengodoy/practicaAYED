package sobrecarga;

public class auto {
	int precio = 0;
	String nombre = "";
	int numPasajeros = 0;
	
	public auto(int pre, String nom) {
		this.precio = pre;
		this.nombre = nom;
		
		System.out.println("Se creo un auto con precio " + precio + " y nombre" + nombre);
	}
	
	public auto (int pre, String nom, int num) {
		this.precio = pre;
		this.nombre = nom;
		this.numPasajeros = num;
		System.out.println("Se creo un auto con precio " + precio + " con nombre " + nombre + " y tiene " + numPasajeros + " pasajeros");
	}
	
	
	public void suma() {
		
	}
	
	public void suma(int a) {
		
	}
	
	public void suma(int a, int b) {
		
	}
}
