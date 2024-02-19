package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdeNotas = entrada.nextInt();

        //Quantidade de alunos e quantidades de nota por cada aluno
        double [] [] notasDaTurma =  new double[qtdeAlunos] [qtdeNotas];

        double notaTotal = 0;
        for(int a = 0; a < notasDaTurma.length; a++){
            for(int n = 0; n < notasDaTurma[a].length; n++){
                System.out.printf("informe a nota %d do aluno %d : " ,n,a);
                notasDaTurma[a] [n]= entrada.nextDouble();
                notaTotal += notasDaTurma[a][n];
            }
        }
        for(double [] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }
        double media = notaTotal / (qtdeAlunos*qtdeNotas);
        System.out.println("Média da turma é: " + media);

        entrada.close();
    }
}
