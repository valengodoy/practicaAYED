package POO;

public class camioneta extends Coche{
	private int capCarga;
	private int plazasExtra;
	
	public camioneta(int plazasExtra,int capCarga) {
		
		super(); //llama al constructor de la clase padre
		
		this.capCarga = capCarga;
		
		this.plazasExtra = plazasExtra;
		
	}
	public String datosCamioneta() {
		return "La capacidad de carga es: " + capCarga + ". Las plazas son: " + plazasExtra;
	}
	
	

}
