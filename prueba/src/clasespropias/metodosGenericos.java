package clasespropias;
import java.util.*;

public class metodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombres[] = {"Jose", "Maria", "Pepe"};
		
		System.out.println(misMatrices.getMenor(nombres));
		
		
		
		
		/*emp paco = new emp("Paco", 45, 2500);
		emp ana = new emp("Ana", 45, 2500);
		emp maria = new emp("Maria", 45, 2500);
		
		emp misEmpleados[] = {paco, ana, maria};
		
		System.out.println(misMatrices.getMenor(misEmpleados));*/
		
		GregorianCalendar fechas[] = {new GregorianCalendar(2017, 7, 12),
				new GregorianCalendar(2017, 5, 12),
				new GregorianCalendar(2017, 4, 12),
					
		};
		System.out.println(misMatrices.getMenor(fechas));
		
		
		
		
		
	
	//	String elementos = misMatrices.getElementos(nombres);
		
	//s	System.out.println(elementos);
		/*
		emp arrayE[] = {new emp("Ana", 45, 2500),
				new emp("Ana", 45, 2500),       error
				new emp("Ana", 45, 2500),
				new emp("Ana", 45, 2500),
				new emp("Ana", 45, 2500)
		};
		
		System.out.println(misMatrices.getElementos(arrayE));*/
		
		
	}

}
