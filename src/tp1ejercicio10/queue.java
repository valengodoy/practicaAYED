package tp1ejercicio10;
import java.util.*;


public class queue <T> {
	private List<persona> items;
	private List<persona> priority;
	

	public queue() {
		this.items = new ArrayList<persona>();
		this.priority = new ArrayList<persona>();
	}
	
	
	public void enqueue(persona p){
		if(p.isEsEmbarazada() || p.isTieneNecesidades() || p.getEdad() >= 70){
			priority.add(p);
		}
		else
			items.add(p);
	}
	
	public persona dequeue() {
		if(!isEmptyP()) {
			return priority.remove(0);
		}
		else if(!isEmptyI())
			return items.remove(0);
		else
			throw new IllegalStateException("La cola esta vacia");
	}
	
	public int size() {
		return items.size() + priority.size();
		
	}
	
	public boolean isEmptyI() {
		return items.isEmpty();
	}

	public boolean isEmptyP() {
		return priority.isEmpty();
	}
	
}
