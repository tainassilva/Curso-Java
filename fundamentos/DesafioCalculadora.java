package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	// Ler 2 números e usar o que apenas foi usado em aula ...
		public static void main(String[] args) {
			Scanner entrada = new Scanner (System.in);
			
			System.out.println("Digite um nùmero para fazer a operação: ");
			double numero1 = entrada.nextDouble();
			System.out.println("Digite um nùmero para fazer outra operação: ");
			Double numero2 = entrada.nextDouble();
			System.out.println("Digite a operação que deseja fazer : +, -, *, / ou %");
			String sinal = entrada.next();
			
			// Uso de operadores ternários...
		    double resultado = "+".equals(sinal) ? numero1 + numero2 : 0;
		    resultado = "-".equals(sinal) ? numero1 - numero2 : resultado;
		    resultado = "*".equals(sinal) ? numero1 * numero2 : resultado;
		    resultado = "/".equals(sinal) ? numero1 / numero2 : resultado;
		    resultado = "%".equals(sinal) ? numero1 % numero2 : resultado;
			
			System.out.printf("%.2f %s %.2f = %.2f ", numero1, sinal, numero2, resultado);
			
			entrada.close();
		}
	
}
