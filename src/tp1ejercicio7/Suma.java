package tp1ejercicio7;
import java.util.*;
public class Suma {

	public static int sumarLinkedList(List<Integer> lista, int cont, int suma){
		if(cont != lista.size()) {
			suma+= lista.get(cont);
			return sumarLinkedList(lista, cont +1, suma);
		}
		return suma;
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> lista= new LinkedList <Integer>();
		lista.add(10);
		lista.add(10);
		lista.add(10);
		lista.add(10);
		lista.add(10);
		int cont =0;
		int suma = 0;
		System.out.println(sumarLinkedList(lista, cont, suma)); 
	}

}
