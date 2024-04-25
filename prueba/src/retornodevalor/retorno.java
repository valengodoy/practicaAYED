package retornodevalor;

public class retorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transporte t = new transporte (5000);
		
		int valor = 0;
		
		valor = t.precio();
		
		System.out.println("La funcion devolvio el valor: " + valor);
	}

}
