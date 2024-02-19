package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 3.6;
		
		 // O operador ? mostra as opções da expressão e o : separa as expressões
		// O resultado verdadeiro vem primeiro 
		String resultadoParcial = media >= 5.0 ? "em recuperacao" : " reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;

		
		System.out.println("O aluno está: " + resultadoFinal);
		
		
	}
}
