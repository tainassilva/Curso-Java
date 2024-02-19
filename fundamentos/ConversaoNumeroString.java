package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 =  10000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		// deixando uma string vazia, faz com que o número vire string
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
}
