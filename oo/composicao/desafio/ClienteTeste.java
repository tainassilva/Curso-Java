package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        // Cria um cliente, duas compras, cada compra tem 2 itens
        // Cada item associado a produtos diferentes

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 1897.88),2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 998.90),1);

        Cliente cliente = new Cliente("Taina");
        cliente.adicionarCompra(compra1);
        cliente.listaDeCompra.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}

