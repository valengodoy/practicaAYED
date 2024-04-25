package tp1ejercicio9;
import java.util.*;


public class Stack <T> extends Sequence <T> {
	private List<T> data;
	
	public Stack() {
		data = new ArrayList<T>();
	}
	
	public void push(T data) {
		 this.data.add(0, data);
	}
	
	
	public T pop() {
		return data.remove(0);
	}
	 
	
	 
	public T top(){
		 return data.get(0);
	 }
	
	
	
	public int size() {
		return data.size();
	 }
	
	

	public boolean isEmpty() {
		return data.size()==0;
	 }

	
	public String toString() {
	 String str = "[";
	 for(T d: data)
		 str = str + d +", ";
	str = str.substring(0,str.length()-2)+"]";
	return str;
	}
	
	
	
}


