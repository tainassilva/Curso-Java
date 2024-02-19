package lambda;

import java.util.function.BinaryOperator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        // Calcula a média
        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2) / 2;

        System.out.println(media.apply(9.8, 5.7));

        // Verifica se a média é maior ou igual a 7 e retorna Aprovado ou Reprovado
        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado.apply(9.8, 5.7));

        Function<Double,String> conceito =
                m -> m >= 7 ? "Aprovado" : "Reprovado";

        // Faz a média e depois aplica o conceito...
        System.out.println(media
                .andThen(conceito)
                .apply(9.7,4.1));
    }
}
