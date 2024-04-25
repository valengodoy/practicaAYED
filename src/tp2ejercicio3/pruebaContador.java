package tp2ejercicio3;

import java.util.*;
import tp2ejercicio1.BinaryTree;

public class pruebaContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test numeros Pares");
        BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
        
        ab.addLeftChild(new BinaryTree<Integer>(2));
        
        ab.addRightChild(new BinaryTree<Integer>(6));
        
        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
        
        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
        
        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
        
        ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
        
        ContadorArbol c = new ContadorArbol(ab);
    
        List<Integer> li = c.listaIn();
        System.out.println("Los nodos pares del arbol en InOrder son: ");
        System.out.println(li);
        
        List<Integer> lP = c.listaPost();
        System.out.println("Los nodos pares del arbol en PostOrder son: ");
        System.out.println(lP);
         
		
		
	}

}
