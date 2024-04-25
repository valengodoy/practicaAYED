package tp1ejercicio8;
import java.util.*;
public class prueba {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue <Integer> cola = new Queue <>();
		
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		
		System.out.println("Elementos de la cola: ");
		while(!cola.isEmpty()){
			System.out.println(cola.dequeue());
		}
		
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		
		System.out.println(cola.size());
		System.out.println(cola.head());
		
		
		//cola circular
		CircularQueue <Integer >cir = new CircularQueue<>();
		cir.enqueue(5);
		cir.enqueue(6);
		cir.enqueue(7);
		
		System.out.println(cir.toString());
		cir.shift();
		System.out.println(cir.toString());
		
		
		
		//coladoublended
		DoubleEndedQueue <Integer> deque = new DoubleEndedQueue<>();
		deque.enqueue(8);
		deque.enqueue(9);
		deque.enqueue(10);
		
		System.out.println(deque.toString());
		deque.enqueueFirst(14);
		System.out.println(deque.toString());
		
	}
	
	

	
	

	
	

}
