package fundamentos;

/**
 * @author taina
 * Esta documentação explora as funcionalidades da String. Temos diversos atributos e ferramentas 
 * que auxiliam o programador 
 */

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2)); // Mostra a letra no índice desejado
		// mesmo sem uma variável, é possivel acessar as funcinalidades da string
		
		String s = "Boa tarde";
		// *** Não tem como modificar a variavel do Tipo String

		// Os dois tem o resultado parecido: Concatenação
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!"); 
		
		// Verifica que a String inicia com a palavra indicada (Saída com boolean)
		System.out.println(s.startsWith("Boa"));
		// Essa função é case sensitive. Eu posso colocar as letras em letra minuscula para verificar...
		System.out.println(s.toLowerCase().startsWith("boa"));
		// Assim, sem esse tratamento, vai dar false
		System.out.println(s.startsWith("boa"));
		
		// Verifica o tamanho da string
		System.out.println(s.length());
		
		// Verifica se a string termina com a palavra indicada
		System.out.println(s.endsWith("tarde"));
		
		// Faz comparação de string, mas é case sensitive
		System.out.println(s.equals("Boa tarde"));
		// Essa comparação ignora o case sensitive
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		// Como fazer uma concatenação menos extensa
		var nome = "Taina";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1798.25442;
		
		System.out.println("Nome: " + nome + "\nSobrenome" 
					+ sobrenome + "\nIdade" + idade + 
					"\nSalario: " + salario + "\n\n");
		
		// Fica menos extenso com o printf. O %s é string, %d é inteiro e o %f é float . O %.2f é para limitar depois da vírgula
		System.out.printf("A senhora %s %s tem %d anos e ganha RS%.2f",
				nome, sobrenome, idade, salario);
		//Posso criar uma variável com esse conteúdo :
		String frase = String.format("\nA senhora %s %s tem %d anos e ganha RS%.2f",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		// Verifica se contêm a string dentro da frase 
		System.out.println("Frase qualquer".contains("qual"));
		
		//Verifica em qual índice se encontra a string
		System.out.println("Frase qualquer".indexOf("qual"));
		
		// Quero começar a exibir a partir de um caracter indicado
		System.out.println("Frase qualquer".substring(6));
		// Tambem pode exibir até onde eu quero
		System.out.println("Frase qualquer".substring(6,8)); // o caracter 6 é inclusivo, mas o 8 não
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
