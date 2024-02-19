package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for(String nome : aprovados){
            System.out.println(nome);
        }

        // For each com lambda. Se tiver apenas um parâmetro, não precisa colocar nome entre parenteses
        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

         // Passado cada nome como parâmetro no print(O print tem 2 pontos)
        // Imprima na saída do sistema o método referenciado.
        // Não consigo personalizar, é bem automatizado
        // Para cada elemento de aprovados, chame o print
        System.out.println("\nMethod reference...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));

        // Passando uma referência para a função
        System.out.println("\nMethod reference #01...");
        aprovados.forEach(ForEach::meuImprimir);
    }
    static void meuImprimir(String nome){
        System.out.println("Oi, meu nome é " + nome);
    }
}
