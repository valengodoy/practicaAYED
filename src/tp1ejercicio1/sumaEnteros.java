package tp1ejercicio1;

public class sumaEnteros {
	
	public static void imprimirFor(int a, int b){
		for(int i = a; i<= b; i++) {
			System.out.println(i);			
		}	
	}
	
	
	public static void imprimirWhile(int a, int b) {
		while(a <= b) {
			System.out.println(a);
			a++;
		}		
	}
	
	
	public static void impresionRecursiva(int a, int b) {
		if(a <= b) {
			System.out.println(a);
			sumaEnteros.impresionRecursiva(++a, b);
		}		
	}
}