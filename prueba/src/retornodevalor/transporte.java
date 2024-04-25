package retornodevalor;

public class transporte {
	int precio = 0;
	
	public transporte(int precio) {
		System.out.println("se creo un objeto transporte");
		this.precio = precio;
	}
	
	
	public int precio (){
		
		this.precio ++;
		return this.precio;
		
	}
}
