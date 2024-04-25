package tp2ejercicio6;

import tp2ejercicio1.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> tree;
	
	public Transformacion(BinaryTree<Integer> a) {
		this.tree = a;
	}
	
	
	private int suma(BinaryTree<Integer> tree){
		int suma = 0;
		if(tree.isLeaf()) {
			suma+= tree.getData();
			tree.setData(0);
			return suma;
		}
		if(tree.hasLeftChild()) {
			System.out.println("data "+tree.getData());
			suma+= suma(tree.getLeftChild());
		}
		if(tree.hasRightChild()) {
			System.out.println("data " + tree.getData());
			suma+= suma(tree.getRightChild());
		}
		int aux = tree.getData();
		tree.setData(suma);
		System.out.println("suma + aux "+ suma + " "+aux);
		return suma + aux;
			
		
	}
	
	public BinaryTree<Integer> suma(){
		suma(this.getTree());
		return this.getTree();
	}
	
	


	public BinaryTree<Integer> getTree() {
		return tree;
	}

	public void setTree(BinaryTree<Integer> tree) {
		this.tree = tree;
	}
	
	
	
	
	
	
	
	
}
