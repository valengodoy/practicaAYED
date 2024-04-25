package POO;
import java.util.*;
public class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);
	}
	
	public String dameNombre(){ //getter
		return nombre;		
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
	
	
}
	
	

