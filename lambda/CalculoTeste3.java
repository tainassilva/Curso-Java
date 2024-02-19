package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        // Não precisa definir a interface calc. O próprio BinaryOperator define uma
        // entrada e saída do mesmo tipo
//        Calculo calc = (x, y) -> {
//            double a = x + y;
//            return a;
//        };

        // Tipos genéricos só aceitam classe
        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };
        // O java não permite converter de int para Double(classe)
        // mas permite converter de double(tipo primitivo) para Double(classe)
        // Double a = 1.0;
        //System.out.println(calc.apply(2,3));

        System.out.println(calc.apply(2.0,3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0,3.0));


        BinaryOperator<Integer> calcInt = (x, y) -> {
            return x + y;
        };
        System.out.println(calcInt.apply(2,3));

        calcInt = (x, y) -> x * y;
        System.out.println(calcInt.apply(2,3));
    }
}
