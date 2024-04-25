package tp2ejercicio1;

public class BinaryTree<T>{

	private T data;
	private  BinaryTree<T> leftChild;
	private BinaryTree <T> rightChild;
	
	
	public BinaryTree (T data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}

	
	public void setData(T data) {
		this.data = data;
	}


	public T getData() {
		return data;
	}
	

	public BinaryTree<T> getLeftChild() {
		if(leftChild == null) {
			throw new NullPointerException("No hay hijo izquierdo");
		}
		return leftChild;
	}
	

	public BinaryTree<T> getRightChild() {
		if(rightChild == null) {
			throw new NullPointerException("No hay hijo derecho");
		}
		return rightChild;
	}
	
	
	public void addLeftChild(BinaryTree<T> hijo) {
		this.leftChild = hijo;
	}
	
	
	public void addRightChild(BinaryTree<T> hijo) {
		this.rightChild = hijo;
	}
	
	
	public void removeLeftChild() {
		this.leftChild = null;
	}
	
	
	public void removeRightChild() {
		this.leftChild = null;
	}
	
	
	public boolean hasLeftChild() {
		return this.leftChild != null;
	}
	
	
	public boolean hasRightChild() {
		return this.rightChild != null;
	}
	
	
	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());
	}
	
	
	public boolean isEmpty() {
		return(this.isLeaf() && this.getData() == null);
	}
	
	
	
	public int countLeaves() {
		if ((this.leftChild == null)&&(this.rightChild == null)) {
				return 1;
			
		}
		else {
			int count = 0;
			if(this.leftChild != null) {
				count += this.leftChild.countLeaves();
			}
			if(this.rightChild != null) {
				count+= this.rightChild.countLeaves();
			}
			return count;
		}
	}
	
	public void printPreOrden() {
		System.out.println(this.getData());
		if (this.hasLeftChild()) {
			this.getLeftChild().printPreOrden();
		}
		if(this.hasRightChild()) {
			this.getRightChild().printPreOrden();
		}
	}
	

		
	
	public BinaryTree<T> mirror(){
		BinaryTree <T> mirrorTree = new BinaryTree <T>(this.data);
		if(this.leftChild != null) {
			mirrorTree.rightChild = this.leftChild.mirror();
		}
		
		if(this.rightChild != null) {
			mirrorTree.leftChild = this.rightChild.mirror();
		}
		
		return mirrorTree;
		
	}
	
	
	
	public void entreNiveles(int n, int m ){
		if(this.isEmpty() || n < 0 || n > m || m < 0 ) {
			return;
		}
		BinaryTree <T> arbol = null;
		Queue <BinaryTree <T>> cola = new Queue <>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel = 0;
		while(!cola.isEmpty() && nivel <= m) {
			arbol = cola.dequeue();
			if(arbol != null) {
				if(nivel>= n && nivel <= m) {
					System.out.println(arbol.getData() + " ");
				}	
				if(arbol.hasLeftChild()) {
					cola.enqueue(arbol.getLeftChild());
				}
				if(arbol.hasRightChild()) {
					cola.enqueue(arbol.getRightChild());
				}	
			}
			else if(!cola.isEmpty()) {
				System.out.println();
				cola.enqueue(null);
			}
		}	
			
	}
				
		
}

	








