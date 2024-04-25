package POO;

public class alumno extends persona{
	private String carrera;
	
	public alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}

	

	
	
	
	public String dameDescripcion() {
		return "Alumno \n" + "Estudia la carrera " + carrera;
	}
	
}
