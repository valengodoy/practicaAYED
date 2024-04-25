package tp1ejercicio10;

public class persona {
	private String nombre;
	private int edad; 
	private boolean esEmbarazada;
	private boolean tieneNecesidades;
	
	
	public persona(String nombre, int edad, boolean esEmbarazada, boolean tieneNecesidades) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.esEmbarazada = esEmbarazada;
		this.tieneNecesidades = tieneNecesidades;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isEsEmbarazada() {
		return esEmbarazada;
	}


	public void setEsEmbarazada(boolean esEmbarazada) {
		this.esEmbarazada = esEmbarazada;
	}


	public boolean isTieneNecesidades() {
		return tieneNecesidades;
	}


	public void setTieneNecesidades(boolean tieneNecesidades) {
		this.tieneNecesidades = tieneNecesidades;
	}

	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + ", esEmbarazada=" + esEmbarazada + ", tieneNecesidades="
				+ tieneNecesidades + "]";
	}


	
	
	
	
}
