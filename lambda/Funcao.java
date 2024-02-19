package lambda;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        // Entra um tipo e o seu retorno
        // Verificando se o número é par ou ímpar
        // Encadeando uma atrás da outra respeitando os tipos
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";

        // Aplicando a function
        System.out.println(parOuImpar.apply(33));

        Function<String, String> oResultadoE =
            valor -> "O resultado é : " + valor;

        Function<String, String> empolgado =
                valor ->  valor + "!!!";

        // Chama oResultadoE(andThen : e então) e depois aplica o número
        // Não vai ter problema porque a saída da próxima função foi uma String
        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado).apply(32);

        //**** Os valores respeitam os tipos de saída para entrada na próxima Function

        System.out.println(resultadoFinal);
    }
}
