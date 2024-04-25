package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class emple extends persona {
	
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente = 1;
	
	
	
	public emple(String nom, double sue, int agno, int mes, int dia){
	
		super(nom);
		sueldo = sue;
		Id = IdSiguiente;
		IdSiguiente ++;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
	}

			
	
		//final
	public double dameSueldo() {//getter
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;	
	}
	
	public void subirSueldo(double porcentaje){
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}

	public String dameDescripcion() {
		return "Empleado \n" + "Id = " + Id + ". Sueldo: " + sueldo;
	}
	

}
