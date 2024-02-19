package oo.composicao.desafio;

// Quantos produtos foram comprados associados ao item?
public class Item {
    final int quantidade;
    final Produto produto;

   Item(Produto produto, int quantidade){
       this.produto = produto;
       this.quantidade = quantidade;
    }
}
