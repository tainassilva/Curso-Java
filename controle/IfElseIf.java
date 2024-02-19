package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		// Se não entrar na primeira condição, ele vai parz a próxima, ate que seja verdadeira
		// Se nenhuma for verdadeira, ele vai para o else
		
		if(nota > 10 || nota < 0 ) {
			System.out.println("Nota invàlida");
		}
		else if(nota >= 7) {
			System.out.println("Você passou!");
		}
		else if(nota < 7 && nota >= 3) {
			System.out.println("Você está de recuperação");
		}
		else {
			System.out.println("Você está reprovado");
		}
		
		entrada.close();
		
	}
}
