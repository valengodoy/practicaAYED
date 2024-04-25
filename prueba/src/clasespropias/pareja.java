package clasespropias;

public class pareja <T> {
//<T> tipo generico <U> <K> por convencion
	
	
	private T primero;
	
	
	
	
	public pareja(){
		primero = null;
	}

	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	

	public T getPrimero() {
		return primero;
	}
	
	
	
	
	
}
