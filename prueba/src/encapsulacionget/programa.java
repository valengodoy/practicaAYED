package encapsulacionget;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		auto a = new auto ();
		
		a.setMarca("Ferrari");
		
		System.out.println("El auto es de marca: " + a.getmarca());
		a.setPrecio(100000);
		System.out.println("El auto cuesta: " + a.getPrecio());
	}

} 
