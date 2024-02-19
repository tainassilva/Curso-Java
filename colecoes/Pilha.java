package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        // O add retorna booleano e o push retorna uma exceção
        livros.add("O pequeno príncipe");
        livros.push("Don quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // Mostra o ultimo elemento
        System.out.println(livros.element());

        // Remove do último para o primeiro
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); // null
        System.out.println(livros.pop()); // Exceção
        System.out.println(livros.remove()); //Exceção

        // fila.size(); (Tamanho da fila)
        // fila.clear(); (Limpa a fila)
        // fila.isEmpty(); (Verifica se a fila está vazia)
        // fila.contains(...) (Se determinado item tem na lista)
    }
}
