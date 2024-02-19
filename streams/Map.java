package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        // O Foreach é a stream terminal
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        //UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        //UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println(Utilitarios.maiuscula.andThen(primeiraLetra).andThen(Utilitarios::grito).apply("BMW"));

        System.out.println("\nUsando composição...\n");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
