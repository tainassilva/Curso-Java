package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
	// O usuário tem que digitar a nota de x alunos
	// Tem que somar essas notas, fazendo um contador. So pode somar se a nota for válida
	// Fazer uma variável para mostrar quantas notas válidas e inválidas foram digitadas
	// -1 faz sair do programa
	// Após sair do programa, calcule a média
		
	Scanner entrada = new Scanner(System.in);
	
	double somaNotaValida = 0;
	int notaInvalida= 0;
	int notaValida = 0;
	double notaAluno = 0;
	
	while(notaAluno != -1) {
		System.out.println("Digite a nota do aluno: ");
		notaAluno = entrada.nextDouble();
		 if (notaAluno >= 0 && notaAluno <= 10) {
			 System.out.println("Nota valida armazenada para calcular media");
			 notaValida++;
			 somaNotaValida += notaAluno;
		 }
		 else if (notaAluno != -1) {
			 System.out.println("Nota invalida");
			 notaInvalida++;
		 }
		 System.out.println("Se desejar sair, digite -1");
		
		
	}
	double media = somaNotaValida /(double)notaValida; // casting para conseguir fazer a conta da média
	System.out.println("A media da turma e: " +media);
	System.out.printf("Tivemos %d notas validas\n", notaValida);
	System.out.printf("Tivemos %d notas invalidas", notaInvalida);
	entrada.close();
	
	}
}
