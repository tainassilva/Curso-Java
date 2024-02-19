package lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {

        // Expressão que retorna boolean
        Predicate<Integer> isPar = num -> num % 2 == 0;

        Predicate<Integer> isTresDigitos =
                num -> num >= 100 & num <= 999;

        // Trabalha com 3 operações lógicas: AND,OR e NOT

        // Testa se o número é par e tem 3 dígitos
        System.out.println(isPar.and(isTresDigitos).test(122));

        // Faz a negação da de cima
        System.out.println(isPar.and(isTresDigitos).negate().test(122));

        // Testa se o número é par ou tem 3 digitos
        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}
