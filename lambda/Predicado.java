package lambda;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        // *** Eu quero percorrer uma lista e perguntar se todos os produtos são caros

        Produto produto = new Produto("Celular Samsung", 900, 0.25);

        // O is serve pra identificar um boolean. Não é necessário mas fica legível
        // O produto é caro? Mistura do inglês...
        // Ele recebe um tipo e retorna um boolean
        // Se o produto for maior ou igual a 800 reais, ele retorna true
        Predicate<Produto> isCaro =
                prod -> prod.preco >= 800;

        System.out.println(isCaro.test(produto));

        Predicate<Produto> isCaroComDesconto =
                prodComDesconto -> (prodComDesconto.preco * (1 - prodComDesconto.desconto)) >= 800;

        System.out.println(isCaroComDesconto.test(produto));

        //        Predicate<Produto> isCaro = prod -> false;

    }
}
