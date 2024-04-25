package clasespropias;

public class uso_pareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//clases genericas se adaptan al tipo
		
		pareja <String> una = new pareja <String>();
		una.setPrimero("Valentina");
		System.out.println(una.getPrimero());
		
		
		persona pers1 = new persona("ana");
		pareja <persona> otra = new pareja <persona>();
		otra.setPrimero(pers1); //tipo objeto persona no se ve ana
		System.out.println(otra.getPrimero());
		
	}

}
