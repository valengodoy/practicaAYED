package tp3ejercicio4;

import tp1ejercicio8.Queue;
import tp3ejercicio1.GeneralTree;

public class AnalizadorArbol {

	
	public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol) {
		GeneralTree<AreaEmpresa> tree_aux;
		Queue <GeneralTree<AreaEmpresa>> queue = new Queue <GeneralTree<AreaEmpresa>>();
		
		queue.enqueue(arbol);
		queue.enqueue(null);
		
		double retardoMax = 0;
		int suma = 0;
		int cantNodos = 0;
		
		while(!queue.isEmpty()) {
			tree_aux = queue.dequeue();
			if(tree_aux != null) {
				suma += tree_aux.getData().getNum();
				cantNodos ++;
				
				for(GeneralTree<AreaEmpresa> hijo: tree_aux.getChildren()) {
					queue.enqueue(hijo);
				}
			}
			else {
				double promedio = (suma / cantNodos);
				retardoMax = Math.max(retardoMax, promedio);
				suma = 0;
				cantNodos = 0;
				
				if(!queue.isEmpty()) {
					queue.enqueue(null);
				}			
			}
		}
			
		return retardoMax;
	}
	
	
}
