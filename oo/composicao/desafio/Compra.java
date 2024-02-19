package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> listaItem = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade){
        this.listaItem.add(new Item(p,quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade){
         var produto = new Produto(nome, preco);
         this.listaItem.add(new Item(produto,quantidade));
    }
    double obterValorTotalDaCompra(){
        double total = 0;

        for (Item item : listaItem){
            total += item.quantidade * item.produto.precoProduto;
        }
        return total;
    }
}
