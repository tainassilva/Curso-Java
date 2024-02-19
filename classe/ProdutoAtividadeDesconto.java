package classe;

public class ProdutoAtividadeDesconto {
    public static void main(String[] args) {

        // O new cria um novo objeto e a notação ponto
        //Serve para chamar os membros ...
        ProdutoAtividade produto = new ProdutoAtividade("Notebook", 4356.89);

        ProdutoAtividade produto2 = new ProdutoAtividade();
        produto2.nome = "Caneta preta";
        produto2.preco = 12.56;

        // Desconto que se aplica em datas especiais
        ProdutoAtividade.desconto = 0.35;


        //Valores com desconto com o uso do método precoComDesconto
        double precoFinal1= produto.precoComDesconto();
        double precoFinal2 = produto2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;


        // Imprime os valores que foram atribuidos
        System.out.println(produto.nome + " com desconto: " + produto.precoComDesconto());
        System.out.println(produto2.nome + " com desconto: " + produto2.precoComDesconto());
        System.out.println("Média do carrinho: "+ mediaCarrinho);




    }
}
