package tp1ejercicio3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objetos estudiante
		estudiante[] e = new estudiante [2];
		e[0] = new estudiante ("Juan", "Perez", 1, "juanp@gmail.com", "Calle 13 n 1850 \n");
		e[1] = new estudiante ("Maria", "Gonzalez", 2, "mgonzalez@gmail.com", "Calle 20 n 1245 \n");
		
	
		
		//objetos porfesor
		profesor[] p = new profesor [3];
		p[0] = new profesor ("Leandro", "Lopez", "llopez@gmail.com", "matematica a", "economia \n" );
		p[1] = new profesor ("Paula", "Moreno", "paumoreno@gmail.com", "ingenieria 1", "ingenieria civil \n");
		p[2] = new profesor ("Jose", "Martinez", "mmrtnz@gmail.com", "Base de datos", "informatica \n");
		
	  	for(int i = 0; i <2; i++) {
			System.out.println(e[i].tusDatos());
		}
		
		for(int i = 0; i<3; i++) {
			System.out.println(p[i].tusDatos());
		}
	}

}
