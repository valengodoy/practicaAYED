package arraylist;
import java.util.*;
public class mainEmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*empleador listaE[] = new empleador [3];
		listaE[0] =new empleador("Ana", 45, 2500);
		listaE[1] =new empleador("Jose", 55, 3000);
		listaE[2] = new empleador("Maria", 20, 3500); */

		List <empleador> listaEmpleados = new ArrayList<empleador>();
		
		
		
		listaEmpleados.add(new empleador("Ana", 45, 2500));
		listaEmpleados.add(new empleador("Jose", 55, 3000));
		listaEmpleados.add(new empleador("Maria", 20, 3500));
		listaEmpleados.add(new empleador("Antonio", 35, 4000));
		listaEmpleados.add(new empleador("Ana", 45, 2500));
		listaEmpleados.add(new empleador("Jose", 55, 3000));
		listaEmpleados.add(new empleador("Maria", 20, 3500));
		listaEmpleados.add(new empleador("Antonio", 35, 4000));
		listaEmpleados.add(new empleador("Pedro", 22, 2200));
		listaEmpleados.add(new empleador("Ana", 45, 2500));
		listaEmpleados.add(new empleador("Jose", 55, 3000));
		listaEmpleados.add(new empleador("Pedro", 22, 2200));
		listaEmpleados.add(new empleador("Pedro", 22, 2200));
		listaEmpleados.add(new empleador("Pedro", 22, 2200));
		//listaEmpleados.add(1, new empleador("Olga", 22, 2200)); //pos
		
		//System.out.println(listaEmpleados.get(4).dameDatos());
		
		//listaEmpleados.add("Paco"); error
		
		
		
	//	System.out.println(listaEmpleados.size());
		
		/*for(empleador e: listaEmpleados){ 	//for each
			System.out.println(e.dameDatos());
		} */
		
		//crear iterador
		Iterator <empleador> mi_iterador = listaEmpleados.iterator();
		while(mi_iterador.hasNext()) {
			
			System.out.println(mi_iterador.next().dameDatos());
			
		}
		
		
		
		
		/*for(int i = 0; i < listaEmpleados.size(); i++) { //for normal
			empleador e = listaEmpleados.get(i);
			System.out.println(e.dameDatos()); 
		} */
		
		
		
		
		
		
	}

}
