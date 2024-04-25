package tp2ejercicio6;

import tp2ejercicio1.BinaryTree;

public class TestTransformacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree <Integer> ab = new BinaryTree <Integer >(4);
		 ab.addLeftChild(new BinaryTree<Integer>(2));
	 
	     ab.addRightChild(new BinaryTree<Integer>(6));
	        
	     ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
	        
	     ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
	        
	     ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
	        
	     ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
	     
	     
	     Transformacion trans = new Transformacion (ab);
	 
	    trans.getTree().printPreOrden();
	    trans.suma();
	    System.out.println("suma: ");
	    trans.getTree().printPreOrden();
	}

}
