package tp2ejercicio1;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BinaryTree<Integer> ab = (new BinaryTree<Integer>(40));
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer> (10));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer> (32));
		BinaryTree <Integer> hijoDerecho = (new BinaryTree <Integer> (18));
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		
		ab.printPreOrden();
		
		
		
		ab.entreNiveles(0,1);
		
	
		
		System.out.println(ab.mirror());
		
		
		System.out.println(ab.countLeaves());
				
	}

}
