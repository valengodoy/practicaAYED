package POO;

public class jefe extends Empleado {  //final adelante para que no hereden
	private double incentivo;		 //lo mismo con metodos
	
	public jefe(String nom, double sue, int agno, int mes, int dia){
		
		super(nom ,sue, agno, mes, dia);
		
	}
	
	public void estableceIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	

}
