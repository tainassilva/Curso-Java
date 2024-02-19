package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e add -> Adicionam elementos na fila
        // A diferença é o comportamento quando a fila está cheia
        // .add() lançará uma exceção caso a fila esteja cheia.
        // .offer() retorna falso caso a fila esteja cheia.

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // peek e element -> Obtem o próximo elemento da fila (sem remover)
        // .peek() retorna null caso a fila estiver vazia
        // .element() lança uma exceção caso a fila estiver vazia
        // Se a fila estiver com algum item, não faz nada

        System.out.println(fila.peek()); //Mostra o primeiro elemento da fila
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        // Mostra o elemento da fila já removendo(Abaixo removeu todos)
        // A diferença do remove e do poll é quando a fila está vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // Nulo, porque não tem mais o que remover

        // Se eu jogar com a lista vazia, lança uma exceção
        System.out.println(fila.remove());

        // fila.size(); (Tamanho da fila)
        // fila.clear(); (Limpa a fila)
        // fila.isEmpty(); (Verifica se a fila está vazia)
        // fila.contains(...) (Se determinado item tem na lista)
    }
}
