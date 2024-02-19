package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		// para acessar algumas configurações do dado , colocamos a notação ponto
		// a partir da String , temos diversos tipos de funcionalidades para transformar esse dado
		
		String s = "Bom dia X";
		s =s.replace("X", "Senhora"); // vai substituir o x por senhora
		s= s.toUpperCase(); // coloca a string toda em maiúscula
		s = s.concat("!!!"); // concatenação
		
		System.out.println(s);
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador .
		// Ele tem o valor e nada mais porque não possui atributos e comportamentos
		 
		
		
	}
}
