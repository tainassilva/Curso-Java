package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        // Não retorna nada...
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        // Acessando a partir de um método estático
        Stream<String> langs = Stream.of("Java ", "Lua ","JavaScript\n");
        langs.forEach(print);

        String [] maisLangs = {"Python, ", "Lisp ", "Pearl ","Go\n"};
        Stream.of(maisLangs).forEach(print);

        // Percorrendo todos os elementos do array
        Arrays.stream(maisLangs).forEach(print);

        // Exibe o índice 1 e encerra no 2, exibindo apenas o "Lisp"
        Arrays.stream(maisLangs, 1,2).forEach(print);

        List <String> outrasLangs = Arrays.asList("C", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);

        // Não aparece ordenadas porque executam em paralelo
        outrasLangs.parallelStream().forEach(print);

        // Gera sem uma ordenação, de forma infinita
        Stream.generate(()-> "a").forEach(print);

        // Gera de forma ordenada. Seed é o valor inicial
        Stream.iterate(0,n-> n+1).forEach(println);

    }
}
