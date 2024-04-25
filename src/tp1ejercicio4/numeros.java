package tp1ejercicio4;

public class numeros {
	
	public static void swap1 (int x, int y) {
		if (x < y) {
			int tmp = x ;   //son copias por lo q en main sigue igual
			x = y ;
			y = tmp;    
		}
	}
	public static void swap2 (Integer x, Integer y) {
		if (x < y) {
			int tmp = x ;      //son inmutables, no modifica, wrappers
			x = y ;
			y = tmp;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 2;
		Integer c = 3, d = 4;
		swap1(a,b);
		swap2(c,d);
		System.out.println("a=" + a + " b=" + b) ;
		System.out.println("c=" + c + " d=" + d) ;

	}
	

}
