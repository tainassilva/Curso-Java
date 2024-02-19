package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String();
		System.out.println("2" == s1); // Forma errada de fazer comparação
		System.out.println("2".equals(s1)); // Equals serve para comparar string
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // O próprio next tira os espaços em branco, já o nextLine não tira
		
		System.out.println("2" == s2.trim()); // O trim tira os espaços vazios
		System.out.println("2".equals(s2));  // Sempre compare strings com equals
	
		entrada.close();
	}
}
