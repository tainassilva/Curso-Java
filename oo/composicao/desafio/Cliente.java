package oo.composicao.desafio;

// Quanto que o cliente gastou na loja?
// Percorrer todos os itens e somar todos do array
// UM cliente tem uma lista de compras(Classe Compra)

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nomeCliente;
    final List<Compra> listaDeCompra = new ArrayList<>();

    Cliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    void adicionarCompra(Compra compra){
        this.listaDeCompra.add(compra);
    }

    //Percorrer as compras e obter o valor total de cada compra
    double obterValorTotal(){
        double total = 0;

        for(Compra compra: listaDeCompra){
            total =+ compra.obterValorTotalDaCompra();
        }
        return total;
    }
}
