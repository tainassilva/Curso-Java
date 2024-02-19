package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String palavraMagica = "";	
		
		// O trecho de código é executado sem testar condições. É só testada no fim do bloco	
		// Só para de executar quando a condição parar de ser verdadeira...
		do {
			System.out.println("Voce precisa falar as palavras magicas");
			System.out.print("Quer sair? ");
			palavraMagica = entrada.nextLine();
			
		} while(!palavraMagica.equalsIgnoreCase("por favor")); // Se a palavra for diferente, repete
		System.out.println("Obrigado!!!");
		
		entrada.close();
	}
	// A condição de parada do do while é diferente... ele executa primeiro e depois testa a condição
		
		
}
