package tp2ejercicio9;

import tp2ejercicio1.BinaryTree;

public class pArboles {
	private BinaryTree <Integer> arbol;
	
	
	public pArboles(BinaryTree <Integer> arbol) {
		this.arbol = arbol;
	}
	
	public void sumaDif(BinaryTree arbol, BinaryTree nuevo, int sum, int dif) {
		//sumDif sd = new sumDif(sum+arbol.getData()), dif-arbol.getData());
		//nuevo.setData(sd);
		
		if(arbol.hasLeftChild()) {
		//	nuevo.addLeftChild(new BinaryTree<sumDif>());
		//	sumaDif(arbol.getLeftChild(),nuevo, sum+arbol.getData(), arbol.getData());
		}
		if(arbol.hasRightChild()) {
		//	nuevo.addRightChild(new BinaryTree<sumDif>());
		//	sumaDif(arbol.getRightChild(), nuevo, arbol.getData(), dif -arbol.getData());
		}	
	//}
	
	
	//public BinaryTree<sumDif> sumAndDif(BinaryTree<Integer> arbol){
		//BinaryTree <sumDif> nuevo = new BinaryTree<sumDif>();
		if(arbol.isEmpty() || arbol == null) {
			//return null;
		}
		//sumaDif(arbol, nuevo, 0, 0);
		//return nuevo;
	}
		
	
	
}
