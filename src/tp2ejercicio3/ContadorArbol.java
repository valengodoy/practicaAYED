package tp2ejercicio3;
import java.util.*;

import tp2ejercicio1.BinaryTree;

public class ContadorArbol {
	private BinaryTree<Integer> arbol;
	private BinaryTree<Integer> leftChild;
	private BinaryTree<Integer> rightChild;
	
	
	
	public ContadorArbol(BinaryTree<Integer> a) {
		this.arbol = a;
		this.leftChild = null;
		this.rightChild = null;
			
	}

	
	public BinaryTree<Integer> getArbol() {
		return arbol;
	}


	public void setArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public void numerosIn(List<Integer> l, BinaryTree <Integer> a) {
		if(a.hasLeftChild()) {
			numerosIn(l, a.getLeftChild());
		}
		if(a.getData() % 2 ==0) {
			l.add(a.getData());
		}
		if(a.hasRightChild()) {
			numerosIn(l, a.getRightChild());
		}
	}
	
	
	public List<Integer> listaIn(){
		List <Integer> l = new ArrayList <Integer>();
		if(!arbol.isEmpty()) {
			this.numerosIn(l, arbol);
		}
		return l;
	}
	
	public void numerosPost(List <Integer> l, BinaryTree <Integer> a) {
		if(a.hasLeftChild()) {
			numerosPost(l, a.getLeftChild());
		}
		if(a.hasRightChild()) {
			numerosPost(l, a.getRightChild());
		}
		if(a.getData()% 2 == 0) {
			l.add(a.getData());
		}
	}
	
	
	public List<Integer> listaPost(){
		List<Integer> l = new ArrayList();
		if(!arbol.isEmpty()) {
			this.numerosPost(l, arbol);
		}
		return l;
	}


	

	
	
	
	
}
