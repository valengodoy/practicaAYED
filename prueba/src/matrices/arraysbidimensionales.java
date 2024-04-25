package matrices;

public class arraysbidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//matriz arreglo bidimensional
		
		int[][] matriz = new int [3][3];
		//filas
		//columnas
		
		//matriz [0][0] = 5;
		//matriz [1][2] = 8;
		
		//System.out.println(matriz[1][2]);
		
		for(int i = 0; i < 3; i++) {
			for(int x = 0; x < 3; x ++) {
				matriz[i][x] = 9;
				
			}
		}
		
		

		for(int i = 0; i < 3; i++) {
			for(int x = 0; x < 3; x ++) {
				System.out.println(matriz[i][x]);
				System.out.println("\n");
				
			}
		}
		
		
		
		
		
	}

}
