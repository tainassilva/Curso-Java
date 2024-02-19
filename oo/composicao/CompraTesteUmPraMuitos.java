package oo.composicao;

public class CompraTesteUmPraMuitos {
    public static void main(String[] args) {

        Compra compra = new Compra();
        compra.cliente = "Taina Santos";

        // Adicionando a lista de itens
//        compra.itens.add(new Item("Caneta", 20,7.45));
//        compra.itens.add(new Item("Borracha", 12,3.89));
//        compra.itens.add(new Item("Caderno", 3,18.79));

        // Adicionando a lista de itens. A compra vai pra dentro do item (Bidirecional)
        compra.adicionarItem("Caneta", 20,7.45); //Esse método já instancia um item
        compra.adicionarItem(new Item("Borracha", 12,3.89));
        compra.adicionarItem(new Item("Caderno", 3,18.79));

        // Tamanho da lista
        System.out.println(compra.itens.size());
        System.out.println(compra.obterValorTotal());

        // Só pra mostrar a relação bidirecional
        double total = compra.itens.get(0).compra
                .itens.get(1).compra.obterValorTotal();
        System.out.println("O total é " + total);
    }
}
