package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        // Não retorna nada , apenas imprime o valor no console
        Consumer <Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        //Recebe um único parâmetro e não retorna nada.
        // Seria mais interessante um for each para retornar vários produtos
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Lápis", 10.00, 0.10);
        Produto p3 = new Produto("Apontador", 9.50, 0.09);
        Produto p4 = new Produto("Caderno", 30.50, 0.15);
        Produto p5 = new Produto("Lápis para colorir", 20.00, 0.05);

        // Criando uma lista de produtos...
        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        // Percorrendo todos os produtos
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        // Imprime todos os produtos chamando o toString
        produtos.forEach(System.out::println);
    }
}
