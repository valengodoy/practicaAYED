package POO;

public class uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		persona[] p = new persona[2];
		p[0] = new emple("Juan Perez", 50000, 2010, 3, 5);
		p[1] = new alumno("Pedro Ramirez", "Licenciatura en Sistemas");
		
		for(persona per: p) {
			System.out.println(per.dameNombre() + per.dameDescripcion());
			
		}
		
		
	}

}
