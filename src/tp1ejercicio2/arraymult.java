package tp1ejercicio2;

import java.util.Scanner;

public class arraymult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese un numero para crear un arreglo");
		int numero = s.nextInt();
		
		int[] multiplos = new int [numero];

		for(int i = 0; i< multiplos.length ; i++) {
			multiplos[i] = numero*(i+1);
			System.out.println(multiplos[i] + " ");
			
		}
		
		
	}
}



