package arrays;

// Para cada elemento, ele vai fazer um laço de repetição
public class ForEach {
    public static void main(String[] args) {
        double[] notas = {8.5, 5.9, 9.7, 9.4};

        // O que faria tradicionalmente para percorrer cada elemento do array
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }
        // Só para pular linha mesmo
        System.out.println();

        // Com o for each. Cada valor de notas fica dentro da variável nota
        for (double nota: notas){
            System.out.println(nota + " ");
        }
    }
}