package tp2ejercicio4;

import tp2ejercicio1.BinaryTree;


public class RedBinariaLlena {

	private BinaryTree <Integer> tree;
	
	
	
	public RedBinariaLlena(BinaryTree <Integer> a) {
		this.tree = a;
	
	}
	
	private int retardoReenvio(BinaryTree <Integer> a) {
		if(a.isLeaf()) {
			return a.getData();
		}
		int L = 0;
		int R = 0;
		if(a.hasLeftChild()) {
			 L = retardoReenvio(a.getLeftChild());
			 System.out.println("l" + L + "hijo" + a.getData());
		}
		if(a.hasRightChild()) {
			 R = retardoReenvio(a.getRightChild());
			 System.out.println("r" + R + "hijo" + a.getData());
		
		}
		if(L > R) {
			System.out.println("suma l" + L);
			return a.getData() + L;
			
		}
		else {
			System.out.println("suma R" + R);
			return a.getData() + R;
		}
	}
	
	public int retardoReenvio() {
		return retardoReenvio(this.tree);
	}
}
