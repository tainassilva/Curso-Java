package fundamentos;
 
public class DesafiosAritmeticos { 
	// Desafio aula 43.. Resultaoo final : 125
	
	public static void main(String[] args) {
		int primeiraConta = (1-5) * (2-7);
		int segundaConta = primeiraConta / 2;
		int terceiraConta = (int) Math.pow(segundaConta, 2);
		
		int quartaConta = (3+2) * 6;
		int quintaConta = (int) Math.pow(quartaConta, 2);
		int sextaConta = quintaConta / (3 *2);
		
		int subtracaoNumerador = sextaConta - terceiraConta;
		int potenciacaoNumerador = (int) Math.pow(subtracaoNumerador, 3);
		
		int denominador = (int) Math.pow(10, 3);
		
		int resultadoConta = potenciacaoNumerador / denominador;
		
		System.out.println(resultadoConta);
		
		
	}
}
