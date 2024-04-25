package tp3ejercicio1;
import java.util.*;

public class RecorridosAG {

	public List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree <Integer> a, Integer n){
		List <Integer> lis = new LinkedList<Integer>();
		preOrden(a, lis, n);
		return lis;				
	}
	
	public void preOrden(GeneralTree <Integer> a, List <Integer> lis, Integer n) {
		if((a.getData() % 2 != 0)&&(a.getData() > n)) {
			lis.add(a.getData());
		}
		List <GeneralTree<Integer>> hijos = a.getChildren();
		for(GeneralTree<Integer> hijo: hijos) {
			preOrden(hijo, lis, n);
		}
	}
	
	
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> lis = new LinkedList<Integer>();
		inOrden(a, lis, n);
		return lis;
	}
	
	
	public void inOrden(GeneralTree <Integer> a, List<Integer> lis, Integer n) {
		List <GeneralTree<Integer>> hijos = a.getChildren();
		if(!hijos.isEmpty()) {
			inOrden(hijos.get(0), lis, n);
		}
		if((a.getData() %2 == 0) && (a.getData() >n)) {
			lis.add(a.getData());
		}
		for(int i  = 1; i< hijos.size(); i++) {
				inOrden(hijos.get(i), lis, n);
			}
	}
		
	
	public List<Integer> numerosImparesmayoresQuePostOrden(GeneralTree<Integer> a, Integer n){
		List <Integer> lis = new LinkedList<Integer>();
		postOrden(a, lis, n);
		return lis;
	}
	
	public void postOrden(GeneralTree<Integer> a, List<Integer> lis, int n) {
		if(a != null) {
			List <GeneralTree<Integer>> hijos = a.getChildren();
			
			if(hijos != null) {
				for(GeneralTree<Integer> hijo: hijos) {
					postOrden(hijo, lis, n);
				}
			}
		}
		if((a.getData()%2 == 0) &&(a.getData() > n)) {
			lis.add(a.getData());
		}
	}
	
	
	/*
	
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a, Integer n){
		List <Integer> result = new LinkedList<Integer>();
		GeneralTree<Integer> tree_aux;
		
		Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
		queue.enqueue(a);
		if(!queue.isEmpty()) {
			tree_aux = queue.dequeue();
			result.add(tree_aux.getData());
			List <GeneralTree> hijos = tree_aux.getChildren();
			for(GeneralTree<Integer> hijo: hijos) {
				queue.enqueue(hijo);
			}
			return result;
			
			
			
		}
	} */
	
	
	
	
	
	
}
