package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

        // Não recebe nada de parâmetro
        // Só coloca os parênteses quando não tem parâmetro ou mais de um parâmetro
        Supplier< List<String> > umaLista =
                () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println(umaLista.get());
    }
}
