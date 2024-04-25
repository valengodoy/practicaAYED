package tp1ejercicio7;
import java.util.*;

public class Sucesion {
	
	public static void calcularSucesion (List<Integer> sucesion, int n){
		sucesion.add(n);
		while(n > 1) {
			if(n %2 == 0) {
				n = n/2;
				sucesion.add(n);
			}
			else {
				n = 3*n +1;
				sucesion.add(n);
			}
				
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Ingrese un numero");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		List <Integer> sucesion = new ArrayList <Integer>();
		
		calcularSucesion(sucesion, n);
		
		for(Integer i: sucesion) {
			System.out.println(i);
		}
		
		
	}

}
