package arrays;

import java.util.Arrays;
// O array é um objeto e ele tem comportamentos
public class ExercicioForEach {
    public static void main(String[] args) {

        //Declarando um array com seu tipo e seu tamanho
        double[] notasAlunoA = new double[3];

        // Cada valor que vai em determinado índice
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 5.2;

        // Tem que colocar to string porque não aparece diretamente
        System.out.println(Arrays.toString(notasAlunoA));


        // For each : Percorrendo os índices até o fim do array
        for(double notaA : notasAlunoA){
            System.out.println(notaA + " ");
        }

        System.out.println();

        // Pode fazer um array colocando os valores diretamente
        // Pode se fazer uma variável e adicionar dentro do array, respeitando o tipo numérico]
        final double notaArmazenada = 8.7;
        double [] notasAlunoB = {6.9, notaArmazenada, 7.9, 10};

        // For each : Percorrendo os índices até o fim do array
        for(double notaB : notasAlunoB){
            System.out.println(notaB + " ");
        }


    }
}
