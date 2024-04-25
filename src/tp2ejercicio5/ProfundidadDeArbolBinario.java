package tp2ejercicio5;

import tp1ejercicio8.Queue;
import tp2ejercicio1.BinaryTree;

public class ProfundidadDeArbolBinario {

	private BinaryTree <Integer> tree;
	
	
	public ProfundidadDeArbolBinario(BinaryTree <Integer> a) {
		this.tree = a;
	}
	
	
	public int sumaElementosProfundidad(int prof) {
		Queue<BinaryTree<Integer>> queue = new Queue <BinaryTree<Integer>>();
		Queue<Integer> nivel = new Queue <Integer>();
		int suma = 0;
		queue.enqueue(this.tree);
		nivel.enqueue(0);
		while(!queue.isEmpty()) {
			BinaryTree<Integer> arbol = queue.dequeue();
			int level = nivel.dequeue();
			if(level == prof) {
			suma += arbol.getData();
			}
			if(arbol.hasLeftChild() && level < prof) {
				nivel.enqueue((level+1));
				queue.enqueue(arbol.getLeftChild());
				
			}
			if(arbol.hasRightChild() && level < prof) {
				nivel.enqueue(level+1);
				queue.enqueue(arbol.getRightChild());
			}
		}
		return suma;		
	}

}
	
	
		

