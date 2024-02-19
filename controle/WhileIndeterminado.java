package controle;
import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[]args) {
		// Fazer um laço até que a pessoa digite a palavra sair 
		
		Scanner entrada = new Scanner(System.in);
		String continuarLaco = "";
		
		// Se a string for diferente da palavra "sair", vai ficar no laço 
		while (!continuarLaco.equalsIgnoreCase("sair") ) { 
		System.out.print("Voce esta em um laco de repeticao.Voce deseja sair?"
				+ "Se sim, digite 'sair', senao voce vai continuar aqui: ");
		continuarLaco = entrada.next(); //Atribuindo um novo valor a variável
		}
		System.out.println("Fim do laco!!!");
		
		entrada.close();
}
}