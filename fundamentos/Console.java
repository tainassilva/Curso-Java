package fundamentos;

import java.util.Scanner;

	public class Console {
		public static void main(String[] args) {
			
			// Mantêm a impressão na mesma linha
			System.out.print("Bom");
			System.out.print(" dia! ");
			// Mas se eu colocar um \n ele quebra a linha
			
			// Cria uma nova linha após o comando ser executado
			System.out.println("Bom");
			System.out.println("dia");
			
			// Pega os caracteres especiais e substituem pelos valores separados por vírgula
			System.out.printf("Megasena: %d %d %d %d %d %d\n", 1,2,3,4,5,6);
			System.out.printf("Salário: %.2f\n", 1234.43434);
			
			//Recebe informações de entrada
			Scanner entrada = new Scanner(System.in);
				
			// Para o usuário digitar algo
			System.out.printf("Digite o seu nome: ");
			String nome = entrada.nextLine();
			System.out.println("Nome = " + nome);
			
			System.out.printf("Digite o seu sobrenome: ");
			String sobrenome = entrada.nextLine();
			System.out.println("Sobrenome: " + sobrenome);
			
			System.out.printf("Digite a sua idade: ");
			int idade = entrada.nextInt();
			System.out.println("Idade = " + idade);
			
			System.out.printf("%s %s tem %d anos de idade.", nome,sobrenome,idade);
			
			// tem que fechar o Scanner para não ficar ocupando recursos da máquina
			entrada.close();
			
			
			
		
	}
		}
	

