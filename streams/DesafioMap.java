/*
       1. Número para String binária... 6 => "110"
       2. Inverter a String... "110" => "011"
       3. Converter de volta para inteiro => "011" => 3

       Está dentro da classe Integer.
        */

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//        for(int i = 0; i <10 ; i++) {
//            String numeroBinario = Integer.toBinaryString(i);
//            System.out.println(numeroBinario);
//        }
//        Function<Integer, String> transformandoBinario =
//                numero -> numero < 10 ? Integer.toBinaryString(numero) : "";
//
//        Function<String, String > invertendoStrings =
//                invertendo -> inverterString(invertendo);
//
//        Function<String, Integer> transformandoNumero =
//                numero -> Integer.parseInt(numero,2);
//
//        nums.stream()
//                .map(Integer::toBinaryString)
//                .map(invertendoStrings)
//                .map(transformandoNumero)
//                .forEach(print);


        // RESULTADO DO PROFESSOR

        UnaryOperator<String> inverter =
            s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s,2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(print);

    }
//    public static String inverterString(String original) {
//        StringBuilder reversed = new StringBuilder(original);
//        reversed.reverse();
//        return reversed.toString();
//    }
}
