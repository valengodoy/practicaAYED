package encapsulacionget;

public class auto {

	//atributos
	private int precio;
	private String marca;
	
	
	
	//constructor
	public auto() {
		System.out.println("Se creo un objeto auto");
		
	}
	
	//metodos getters y setters
	public int getPrecio() {
		return this.precio;
	}
	
	public String getmarca() {
		return this.marca;
		
	}
	public void setPrecio(int p) {
		this.precio = p;
	}
	
	public void setMarca(String m) {
		this.marca = m;
		
	}
	
}
