package tp2ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Queue<T>{
	
	 List <T> data;
		
		public Queue() {
			this.data = new ArrayList<>();
			
			
		}
		
		public int size() {
			return data.size();
			
		}
		
		public boolean isEmpty() {
			return data.size()== 0;
		}
		
		public void enqueue(T dato) {
				data.add(dato);
			
		}
		
		public T dequeue() {
			if(!data.isEmpty()) {
				return data.remove(0);
			}
			else
				throw new IllegalStateException("La cola esta vacia");
			
		}
		
		public T head() {
			return data.get(0);
		}
		
		public String toString() {
			String str = "["; 
			for(T d: data) 
				str = str + d + ", ";
			str = str.substring(0, str.length()-2)+ "]";
			return str;
		}
		
		
}

	

