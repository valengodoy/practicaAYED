package tp1ejercicio7;
import java.util.*;


public class Invertir {
	
	public static void invertirArray(List<Integer> lista, int pri, int ult){
		if(pri < ult) {
			int aux = lista.get(pri);
			lista.set(pri, lista.get(ult));
			lista.set(ult, aux);
			Invertir.invertirArray(lista, pri+1, ult-1);
		}		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <Integer> lista = new ArrayList <Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		int pri = 0;
		int ult = lista.size()-1;
		invertirArray(lista, pri, ult);
		
		for(Integer i: lista) {
			System.out.println(i);
		}
		

	}

}
