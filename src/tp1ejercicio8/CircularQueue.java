package tp1ejercicio8;

import java.util.List;

public class CircularQueue<T> extends Queue<T>{
	
	

	public T shift() {
		if(!super.isEmpty()) {
			T dato = super.dequeue();
			super.enqueue(dato);
			return dato;
		}
		else
			throw new IllegalStateException("La cola esta vacia");
	}
	

}
