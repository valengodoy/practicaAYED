package tp2ejercicio7;
import java.util.*;

import tp2ejercicio1.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> arbol;
	


	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	private BinaryTree<Integer>buscarNodo(BinaryTree<Integer>arbol, int num){
		if(arbol.getData() == num) {
			return arbol;
		}
		BinaryTree <Integer> nodo = null;
		
		if(arbol.hasLeftChild()) {
			nodo = buscarNodo(arbol.getLeftChild(), num);
		}
		if(arbol.getData() != null) {
			return nodo;
		}
		if(arbol.hasRightChild()) {
			nodo = buscarNodo(arbol.getRightChild(), num);
		}
		return nodo;
	}
	
	
	private int contarHijos(BinaryTree<Integer> arbol) {
		if(arbol == null) {
			return -1;
		}
		if(arbol.isLeaf()) {
			return 0;
		}
		int count = 0;
		if(arbol.hasLeftChild()) {
			count += contarHijos(arbol.getLeftChild());
		}
		if(arbol.hasRightChild()) {
			count += contarHijos(arbol.getRightChild());
		}
		if((arbol.hasLeftChild() && !arbol.hasRightChild())||(!arbol.hasLeftChild() && arbol.hasRightChild())) {
	            count++;
	            return 1;
		}
		return count;
		
	}
	
	
	public boolean isLeftTree(int num) {
		BinaryTree <Integer> nodo = buscarNodo(arbol, num);
		if(nodo == null) {
			System.out.println("No se encontro el nodo");
			return false;
		}
		int hijoIzq = -1;
		int hijoDer = -1;
		
		if(nodo.hasLeftChild()) {
			hijoIzq = contarHijos(nodo.getLeftChild());
		}
		if(nodo.hasRightChild()) {
			hijoDer = contarHijos(nodo.getRightChild());
	
		}
		System.out.println("derecha: " + hijoDer + " | izquierda: " + hijoIzq);
		return hijoIzq > hijoDer;
	}
}
