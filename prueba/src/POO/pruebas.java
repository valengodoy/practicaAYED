package POO;

public class pruebas {

	public static void main(String[] args) { //array strings
		// TODO Auto-generated method stub

		Empleados t1 = new Empleados("Paco");
		
		Empleados t2 = new Empleados("Anna");
		
		Empleados t3 = new Empleados("Pedro");
		
		Empleados t4 = new Empleados("Maria");
		
		t1.cambiaSeccion("RRHH");
		
		System.out.println(t1.devolverDatos() + "\n" + t2.devolverDatos()
			+"\n" + t3.devolverDatos() + "\n" + t4.devolverDatos());
		
		System.out.println(Empleados.devolverIdSig());
		
		
	}
	
static class Empleados{
		private final String nombre; //final -> const
		private String seccion;
		private int Id;
		private static int IdSiguiente = 1;
		
		public Empleados(String nom){
			nombre = nom;
			seccion = "Administracion";
			Id = IdSiguiente;
			IdSiguiente ++;
		}
		
		public void cambiaSeccion(String seccion) {
			this.seccion = seccion;
		}
			
		
		public String devolverDatos() {
			return "El nombre es: " + this.nombre + ", la seccion es: " 
		+ this.seccion + " y el Id = " + this.Id;	
		}
		
		
		public static String devolverIdSig(){
			return "El Id siguiente es: "+ IdSiguiente;
		}
		
		
	}

}
