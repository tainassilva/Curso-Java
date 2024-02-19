package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a faixa que você está: ");
		String faixa = entrada.next();
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
			break;
			
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
			break;
		
		case "roxa":
			System.out.println("Sei o Heian Godan");
			break;
		
		default:
			System.out.println("Não sei nada");
		
		}
		System.out.println("Fim do teste.");
		entrada.close();
	}
}

