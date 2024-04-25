package POO;

abstract class persona {
	private String nombre;
	
	public persona(String nom) {
		nombre = nom;
	}
	
	public String dameNombre(){
		return nombre;
	}
	
	
	public abstract String dameDescripcion();
	
	
	

}
