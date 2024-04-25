package tp1ejercicio9;

public class TestBalanceo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("Ingrese una cadena para verificar balanceo");
			return;
		}
		String exp = args[0];
		System.out.println("La caderna esta balanceada? " + validar(exp));		
	}
	
	private static boolean validar(String exp) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < exp.length(); i ++) {
			char car = exp.charAt(i);
			if(car == '(' || car == '[' || car == '{') {
				stack.push(car);
			}
			else if(car == ')' || car == ']' || car == '}') {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if((car == ')' && top != '(') || (car == ']' && top != '[') || (car == '}' && top!= '{')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	

}
