package tp3ejercicio1;
import java.util.LinkedList;
import java.util.List;

import tp1ejercicio8.Queue;

public class GeneralTree<T> {
	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public int altura() {	
		int alt = 0;
		if(this.isEmpty()) {	
			return -1;
		}
		if(this.isLeaf()) {
			return 0;
		}
		List <GeneralTree<T>> hijos = this.getChildren();
		for( GeneralTree<T> hijo: hijos) {
			alt = Math.max(hijo.altura(), alt);
		}
		return alt+1;
	}
	
	public int nivel(T dato){
		GeneralTree<T> tree_aux;
		
		Queue<GeneralTree<T>> queue = new Queue <GeneralTree<T>>();
		int nivel = 0;
		boolean encontre = false;
		
		queue.enqueue(this);
		while(!queue.isEmpty()) {
			tree_aux = queue.dequeue();
			if(tree_aux == dato) {
				encontre = true;
				break;
			}
			for(GeneralTree<T> hijo: children) {
				queue.enqueue(hijo);
			}
			nivel++;
		}
		if(encontre) {
			return nivel;
		}
		else
			return -1;
		
	 }
	

	public int ancho(){
		GeneralTree<T> tree_aux;
		Queue<GeneralTree<T>> queue = new Queue <GeneralTree<T>>();
		
		queue.enqueue(this);
		queue.enqueue(null);
		
		int anchoMax = 0;
		int cont = 0;
	
		while(!queue.isEmpty()) {
			tree_aux = queue.dequeue();
			if(tree_aux == null) {
				anchoMax = Math.max(anchoMax,cont);
				cont = 0;
				if(!queue.isEmpty()) {
					queue.enqueue(null);
				}
			}
			else {
				cont++;
			
				for(GeneralTree<T> hijo: children) {
						queue.enqueue(hijo);			
				}
			} 
		}
	return anchoMax;
	}
	
	private boolean buscarNodoDesde(GeneralTree<T> arbol, T b) {
		if(arbol == null) {
			return false;
		}
		if(arbol.getData().equals(b)) {
			return true;
		}
		for(GeneralTree<T> hijo: children) {
			if(buscarNodoDesde(hijo, b)) {
				return true;
			}
		}
		return false;
	}
	
	
	private boolean esAncestro(GeneralTree<T> arbol, T a, T b) {
		if(arbol == null) {
			return false;
		}
		if(arbol.getData().equals(a)) {
			return buscarNodoDesde(arbol, b);
		}
		for(GeneralTree<T> hijo: children) {
			if(esAncestro(hijo, a, b)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	public boolean esAncestro(T a, T b) {
		return esAncestro(this, a, b);
		
	}
	
	
	
	
	
	
}


