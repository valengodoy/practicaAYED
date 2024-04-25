package tp2ejercicio8;

import tp2ejercicio1.BinaryTree;

public class Parcial {
	private BinaryTree<Integer> arbol;
	
	
	public Parcial(BinaryTree <Integer> arbol) {
		this.arbol = arbol;
	}

	
	
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2){
		if(arbol1.getData() != arbol2.getData()) {
			return false;
		}
		if(arbol1.isLeaf()) {
			return true;
		}
		if(arbol1.hasLeftChild() && !arbol2.hasLeftChild()) {
			return false;
		}
		if(!arbol1.hasRightChild() && arbol2.hasRightChild()) {
			return false;
		}
		if(!arbol1.hasLeftChild() && !arbol2.hasLeftChild()) {
			return true;
		}
		if(!arbol1.hasRightChild() && !arbol2.hasRightChild()) {
				return true;
		}
		return esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild()) &&  esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
	}
}