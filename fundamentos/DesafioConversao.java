package fundamentos;

import java.util.Scanner;

/**
 * @author taina
 *
 * Exercício : Capturar 3 strings que vão ter como função:
 * Calcular a média dos 3 últimos salários de um funcionário
 * Após captutar a string , transforme ela em double
 */

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: "); // Deixa o scanner na mesma linha
		String salario1 = entrada.nextLine().replace(",", "."); // substitui a virgula pelo ponto(Replace)
		System.out.print("Digite o segundo salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o terceiro salário: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		Double conversao1 = Double.parseDouble(salario1); // convertendo com a classe Double
		Double conversao2 = Double.parseDouble(salario2);
		Double conversao3 = Double.parseDouble(salario3);
		
		double media = (conversao1 + conversao2 + conversao3) / 3;
		
		System.out.println("A média salarial dos 3 salários é : R$" + media );
		
		entrada.close();
	}
}
