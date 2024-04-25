package tp1ejercicio5;

public class calcular {
	private int max;
	private int min;
	private double promedio = 0;
	private int suma = 0;

	public calcular() {
		
	}
	
	//////////////////////// A
	
	
	public static double[] calculareturn(int[] array) {
		double[]resultados = new double [3];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double suma = 0;
		
		for(int i = 0; i< array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			else {
				min = array[i];
			}
			suma += array[i];
		
		}
		
		double prom = suma / array.length;
		resultados[0] = max;
		resultados[1] = min;
		resultados[2] = prom;
		
		return resultados;
	}
	
	/////////////////////// B
	
	public void agregarnumero(int num) {
		promedio+= num;
		suma++;
		if(num > max){
			max = num;
		}
		else {
			min = num;
		}				
	}
	public void mostarResultados() {
		double prom = promedio / suma;
		System.out.println("Maximo: " + max);
		System.out.println("Minimo: " + min);
		System.out.println("Promedio: " + prom);
	}
	
	///////////////////////// C
	
	
		
}

	
	
	
	
	

