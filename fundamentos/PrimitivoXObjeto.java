package fundamentos;

public class PrimitivoXObjeto {
	public static void main(String[] args) {
		
		//Criação de um novo objeto sempre vai ter esse new com o nome da classe
		String s = new String("Texto");
		s.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}
}
