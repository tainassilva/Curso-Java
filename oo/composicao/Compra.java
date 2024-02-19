package oo.composicao;

import java.util.ArrayList;

public class Compra {

    // Poderia ser uma classe com os atributos de cliente
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, int quantidade, double preco){
        this.adicionarItem(new Item(nome, quantidade, preco));
    }
    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this; // A compra associada a esse item é a minha classe atual
    }
    double obterValorTotal(){
        double valorTotal = 0;

        // percorre toda a lista
        for(Item item : itens){
            // se for mais de um item igual. é multiplicado pela quantidade
            valorTotal += item.quantidade * item.preco;
        }
        return valorTotal;
    }

}
