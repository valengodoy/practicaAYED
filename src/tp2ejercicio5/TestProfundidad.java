package tp2ejercicio5;

import tp2ejercicio1.BinaryTree;
import tp2ejercicio4.RedBinariaLlena;

public class TestProfundidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree <Integer> ab = new BinaryTree <Integer >(4);
		 ab.addLeftChild(new BinaryTree<Integer>(2));
	 
	     ab.addRightChild(new BinaryTree<Integer>(6));
	        
	     ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
	        
	     ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
	        
	     ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
	        
	     ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
	     
	     
	     ProfundidadDeArbolBinario pro = new ProfundidadDeArbolBinario(ab);
	     
	     int p = 2;
	     
	     System.out.println("La suma de la profundidad " + p + " "+ "es de " + pro.sumaElementosProfundidad(p));
	}

}
