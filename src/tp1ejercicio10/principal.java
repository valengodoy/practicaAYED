package tp1ejercicio10;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue cola = new queue();
		
		
		persona p1 = new persona("Maria", 20, false, false);
		persona p2 = new persona("Jose", 72, false, false);
		persona p3 = new persona("Anna", 19, true, false);
		persona p4 = new persona("Pedro", 30, false, false);
		persona p5 = new persona("Juan", 60, false, false);
		persona p6 = new persona("Mariana", 20, false, true);
		
		cola.enqueue(p1);
		cola.enqueue(p2);
		cola.enqueue(p3);
		cola.enqueue(p4);
		cola.enqueue(p5);
		cola.enqueue(p6);
		
		while(!cola.isEmptyP() || !cola.isEmptyI()) {
			System.out.println("Atendiendo a " + cola.dequeue().toString());
		}
		
	}

}
