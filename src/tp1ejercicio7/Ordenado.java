package tp1ejercicio7;
import java.util.*;

public class Ordenado {
	
	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
		ArrayList <Integer> lista3 = new ArrayList <Integer>();
		int index1 = 0;
		int index2 = 0;
		
		while(index1 < lista1.size()  && index2 < lista2.size()) {
			if(lista1.get(index1) <= lista2.get(index2)) {
				lista3.add(lista1.get(index1));
				index1++;
			}
			else {
				lista3.add(lista2.get(index2));
				index2++;
			}
		}
		while(index1 < lista1.size()) {
			lista3.add(lista1.get(index1));
			index1++;
		}
		while(index2 < lista2.size()) {
			lista3.add(lista2.get(index2));
				index2++;
		}
		
		return lista3;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lista1 = new ArrayList <Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista1.add(5);
		
		lista2.add(1);
		
		lista1.add(8);
		
		lista2.add(3);
		
		lista1.add(10);
		lista2.add(9);
		lista2.add(11);
		ArrayList <Integer> lista3 = combinarOrdenado(lista1, lista2);
		
		
		for(Integer i: lista3) {
			System.out.println(i);
		}
		
		
	}

}