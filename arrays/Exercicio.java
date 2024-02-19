package arrays;

import java.util.Arrays;
// O array é um objeto e ele tem comportamentos
public class Exercicio {
    public static void main(String[] args) {

         //Declarando um array com seu tipo e seu tamanho
         double[] notasAlunoA = new double[3];

         // Cada valor que vai em determinado índice
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 5.2;

        // Tem que colocar to string porque não aparece diretamente
        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;

        // Percorrendo índice por índice do array
        for(int i = 0; i < notasAlunoA.length; i++){
            //Soma todas as notas do array
            totalAlunoA += notasAlunoA[i];
        }
        // Média das notas
        System.out.println(totalAlunoA / notasAlunoA.length);

        // Pode fazer um array colocando os valores diretamente
        // Pode se fazer uma variável e adicionar dentro do array, respeitando o tipo numérico]
        final double notaArmazenada = 8.7;
        double [] notasAlunoB = {6.9, notaArmazenada, 7.9, 10};

        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoB.length; i++){
            //Soma todas as notas do array
            totalAlunoB += notasAlunoB[i];
            System.out.println(totalAlunoB / notasAlunoB.length);
        }


    }
}
