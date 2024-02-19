package controle;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a faixa que você está: ");
		String faixa = entrada.next();
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
			
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		
		case "roxa":
			System.out.println("Sei o Heian Godan");
		
		default:
			System.out.println("Não sei nada");
		
		}
		// Se não colocar o break, ele vai executar todos que vem após o que foi digitado
		entrada.close();
	}
}
