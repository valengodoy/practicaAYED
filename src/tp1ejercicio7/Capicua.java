package tp1ejercicio7;
import java.util.*;


public class Capicua {

	public static boolean esCapicua(List<Integer> numeros) {
		boolean es = true;
		if(!numeros.isEmpty()) {
			int pri = 0;
			int ult = numeros.size()-1;
			while((pri < ult)&& es){
				if(numeros.get(pri).equals(numeros.get(ult))){
					pri ++;
					ult --;
				}
				else {
					es = false;
				}
			}
		}
		return es;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> numeros = new ArrayList <Integer>(); 
		
		for(int i = 0; i < args.length; i++) {		
			numeros.add(Integer.parseInt(args[i]));
		}
		
		
		
		System.out.println("La secuencia es capicua: "+ esCapicua(numeros));
		
	}
	
	
}
