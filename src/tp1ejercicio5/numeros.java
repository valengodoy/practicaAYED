package tp1ejercicio5;

public class numeros {

	public static void main(String[] args) {
		
		///////////////// A
		
		int[] array = {5, 10, 20, 3, 50};
		
		double[] resultados = calcular.calculareturn(array);
		
		
		System.out.println("Valor maximo: " + resultados[0]);
		System.out.println("Valor minimo: " + resultados[1]);
		System.out.println("Promedio: " + resultados[2]);
		
		//////////////////////  B
		
		calcular c = new calcular();
		
		for(int i =0; i < array.length; i++) {
			c.agregarnumero(array[i]);
		}
		
		c.mostarResultados();
	}

	//////////////// C
	
	
	
}
	
	
	
	
