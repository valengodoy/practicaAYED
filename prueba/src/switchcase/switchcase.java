package switchcase;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch - case
		//estructura de control que permite definir varios casos de seleccion
		
		int var = 2;
		String cadena = "M";
		switch(var) {
			case 0:
				System.out.println("La variable esta vacia");		
			break;
			
			case 1:
				System.out.println("La variable contiene el num 1");
				
			break;
			
			case 2:
				System.out.println("La variable contiene el num 2");
				
			break;		
		}
		
		switch(cadena) {
		case "A":
			System.out.println("La variable contiene A");		
		break;
		
		case "B":
			System.out.println("La variable contiene el num B");
			
		break;
		
		case "C":
			System.out.println("La variable contiene el num C");
			
		break;
		
		default: 
			System.out.println("La variable es dif de A, B y C");
		break;
		
		}

	}
}
