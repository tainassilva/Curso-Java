/**
 * Criar um laço para tirar a média do aluno
 * O aluno escolhe quantas notas ele quer colocar para tirar a média
 * Após escolher a quantidade, cria um array com a respectiva escolha
 * Criar um laço for para adicionar essas notas dentro de um array
 * Percorre o segundo for com foreach, criando uma variável soma
 * No fim, exibe a média do aluno
 * primeira nota : x
 * segunda nota : x
 * Média : x
 */

package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite quantas notas você quer tirar a média: ");
    //Quantas notas o usuário quer tirar média?
    int notasQuantidade = entrada.nextInt();

    // Criando o array com a quantidade de notas que o usuário digitou
    double [] notasAluno = new double[notasQuantidade];

    // Variável para guardar a soma da nota dos alunos
    double somaTotal= 0;

    // Digita a nota e manda para o array
    for(int i = 0; i < notasAluno.length; i++){
        System.out.println("digite a nota: " );
        notasAluno[i] =  entrada.nextDouble();
    }
        // Percorrendo índice por índice do array
        for(double notas: notasAluno){
            //Soma todas as notas do array
            somaTotal += notas;
        }
        // Média das notas
        double media = somaTotal/ notasAluno.length;
        System.out.println("A média da nota total é :  " + media);

        entrada.close();
    }


    }

