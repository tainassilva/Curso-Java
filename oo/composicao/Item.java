package oo.composicao;

public class Item  {
    String nome;
    int quantidade;
    double preco;
    Compra compra; // Fazendo a relação bidirecional

    // Construtor para receber os atributos
    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
