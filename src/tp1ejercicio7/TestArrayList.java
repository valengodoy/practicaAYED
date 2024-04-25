package tp1ejercicio7;

import java.util.*;


public class TestArrayList {
	
	public static boolean verificar(List <Estudiante >listaEsts, Estudiante e4) {
		return listaEsts.contains(e4);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numeros = new ArrayList<Integer>();
	
		
		for(int i = 0; i < args.length; i++) {		//inciso A
			numeros.add(Integer.parseInt(args[i]));
		}
		System.out.println("--------------------");
		System.out.println("Elementos ingresados: " + numeros.size());
		System.out.println("--------------------");
	
		System.out.println("Numeros: ");
		for(Integer j: numeros) {
			System.out.println(j); 
		}
		
		
		List <Estudiante> listaEsts = new LinkedList <Estudiante>();
		Estudiante e1 = new Estudiante("Godoy Valentina", 24185, "valengodoy@gmail.com");
		listaEsts.add(e1);
		Estudiante e2 = new Estudiante("Perez Juan", 25678, "jperez@gmail.com");
		listaEsts.add(e2);
		Estudiante e3 = new Estudiante("Lopez Maria", 34567, "lopezmari@gmail.com");
		listaEsts.add(e3);
		
		System.out.println("Estudiantes:    ");
		for(Estudiante e: listaEsts) {
			System.out.println(e.toString());
		}
		
		
		List <Estudiante> listaCopiaEsts = new LinkedList <Estudiante>(listaEsts);
			
		
		System.out.println("Estudiantes copiados:    ");
		for(Estudiante e: listaCopiaEsts) {
			System.out.println(e.toString());
		}
		listaCopiaEsts.get(0).setNombre("Godoy Ignacio ");
		
		
		System.out.println("Estudiantes:    ");  //podemos ver que el cambio en la copia se ve reflejado
		for(Estudiante e: listaEsts) {			// ya que ambas contienen referencias a los mismos objetos
			System.out.println(e.toString());
		}
		System.out.println("Estudiantes copiados:    ");
		for(Estudiante e: listaCopiaEsts) {
			System.out.println(e.toString());

		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese nombre de alumno a agregar");
		String nombre = s.nextLine();
		
		System.out.println ("Ingrese legajo");
		int legajo = s.nextInt();
		
		s.nextLine();
		
		System.out.println ("Ingrese email");
		String email = s.nextLine();
		
		Estudiante e4 = new Estudiante(nombre, legajo, email);
		
		if(!verificar(listaEsts, e4)){
			listaEsts.add(e4);
			System.out.println("Se agrego el alumno correctamente");
		}
		else {
			System.out.println("El estudiante ya estaba en la lista");
		}
		s.close();
		
		
		
	}



}



/* 7b. ,a implementaion es la misma ya que usan casi los mismo metodos y al ser diferentes
 * en este caso da lo mismo 
 * 7c. si, un for normal, recursion, while e iterator
 * 7d. Existen varias formas de copiar una lista: 
 * 	Crear, mediante su constructor, un nuevo ArrayList pasando la lista original como argumento al constructor
 * 	Crear un nuevo ArrayList y agregar todos los elementos del original usando el método addAll()
 *	Clonar el ArrayList usando el método clone() */










/* 8. dolbe endedqueue de embarazada 10.
 * colar ciular 10.
 * 
 * */
