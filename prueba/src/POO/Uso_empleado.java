package POO;
import java.util.Scanner;
public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado e1 = new Empleado("Juan Perez", 100000, 2024, 3, 23);
		
		Empleado e2 = new Empleado("Pedro Lopez", 95000, 2016, 6, 12);
		
		Empleado e3 = new Empleado("Ana Dominguez", 120000, 2010, 10, 1);
		
		e1.subirSueldo(5);
		
		e2.subirSueldo(5);
		
		e3.subirSueldo(5);
		
		System.out.println("Nombre: "+ e1.dameNombre()+ ". Sueldo: " + e1.dameSueldo()
		+ ". Fecha de alta: " + e1.dameFechaContrato());
		
		System.out.println("Nombre: "+ e2.dameNombre()+ ". Sueldo: " + e2.dameSueldo()
		+ ". Fecha de alta: " + e2.dameFechaContrato());
		
		System.out.println("Nombre: "+ e3.dameNombre()+ ". Sueldo: " + e3.dameSueldo()
		+ ". Fecha de alta: " + e3.dameFechaContrato()); */
		
		
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Juan Perez", 85000, 2018, 3, 27);
		
		misEmpleados[1]= new Empleado("Pedro Lopez", 95000, 2007, 2, 15);
		
		misEmpleados[2] = new Empleado("Ana Dominguez", 105000, 2004, 11, 22);
		
		misEmpleados[3]= new Empleado("Maria Martinez");
		
		jefe jefe_rrhh = new jefe("Jose Posada", 55000, 2006, 9, 25);
		jefe_rrhh.estableceIncentivo(2570);
		
		misEmpleados[4] = jefe_rrhh; //polimorfismo. principio de sustitucion
		
		misEmpleados[5] = new jefe("Maria", 95000, 2008, 3, 17);
		
		//double num1 =7.5;    casting
		//int num= (int)num1;
		
		jefe jefe_Finanzas = (jefe) misEmpleados[5];  //mientras un jefe siempre sea un empleado
		jefe_Finanzas.estableceIncentivo(55000);	//no aplica la viceversa , un empleado no es siempre un jefe
		
		
		
		
		//for( int i = 0; i< misEmpleados.length; i++) {
		//	misEmpleados[i].subirSueldo(5);
		//	System.out.println("Nombre: "+ misEmpleados[i].dameNombre()+ ". Sueldo: " + misEmpleados[i].dameSueldo()
		//	+ ". Fecha de alta: " + misEmpleados[i].dameFechaContrato());
		//}
		
		for(Empleado e: misEmpleados){
			e.subirSueldo(5);
		}
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: "+ e.dameNombre()+ ". Sueldo: " + e.dameSueldo()
			+ ". Fecha de alta: " + e.dameFechaContrato());
		}
		
		
		
		
		
	
	}

	

		
}
