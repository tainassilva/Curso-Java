package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Digite a sua segunda nota: ");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		// Se a condição for verdadeira, o bloco if que se encaixar é executado
		if (media >=7 && media<=10) { 
			System.out.print("Aprovado");
		}
		if (media <7) {
			System.out.print("Reprovado");
		}
		
		entrada.close();
		
	}
}
