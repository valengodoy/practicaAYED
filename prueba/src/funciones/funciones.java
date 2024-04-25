package funciones;

public class funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Esta es la funcion main");
		//int res = 0;
			
		//System.out.println(res);
		
		//res = devuelveValor();
		
		//System.out.println(res);
		int suma = sumaNumeros(5, 8);
		
		System.out.println("El resultado de la suma es: " + suma);
		}
	
	
	/* estructura
	 * modificador tipoDevolver nombreFuncion(valor recibir){
	 * 	
	 * Instrucciones de la funcion
	 * 
	 * }
	 */
	
	
		//que ejecutan codigo
	public static void Hola(){
		System.out.println("Hola");	
	
	}
	
	
	//que devuelve un valor
	public static int devuelveValor() {
		return 5;
	}
	
	//que reciben(parametros) y devuelven valor
	public static int sumaNumeros(int num1, int num2) {
		return  num1 + num2;
		
	}
	
	

}
