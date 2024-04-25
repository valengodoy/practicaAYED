package tp1ejercicio11;
import java.util.*;


public class lineaColectivo {

	private String nombre;
	private List <String> paradas;
	
	
	public lineaColectivo(String nombre) {
		paradas = new ArrayList<>();
		this.nombre = nombre;
	}
	
	public void agregarParada(String parada) {
		paradas.add(parada);
		
	}
	
	
	
	
}
