package POO;
import java.util.Scanner;
public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		/*Coche auto = new Coche();
		
		System.out.println("Ingrese color de auto");
		auto.setColor(s.next());
	
		System.out.println(auto.dime_datos());
		
		
	
		System.out.println(auto.getColor());
		
	
		System.out.println("Tiene asientos de cuero?");
		auto.configura_Asientos(s.next());
	
		System.out.println(auto.dime_asientos());
		
		System.out.println("Tiene asientos de climatizador?");
		
		auto.configura_climatizador(s.next());
		
		System.out.println(auto.dime_climatizador());
		
		System.out.println(auto.getPeso());
		
		System.out.println("El precio final del auto es:" + auto.precio_coche());
		*/
		
		Coche c1 = new Coche();
		
		c1.setColor("Rojo");
		
		
		camioneta cam1 = new camioneta(7, 580);
		cam1.setColor("Blanco");
		cam1.configura_Asientos("si");
		cam1.configura_climatizador("si");
		
		System.out.println(c1.dime_datos() + " "+ c1.getColor());
		
		System.out.println(cam1.dime_datos() + "\n" + cam1.getColor() + "\n"+ 
		cam1.datosCamioneta());
		
		
		s.close();
	}

}
