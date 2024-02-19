package classe;

public class ProdutoAtividade {
    // Pertencem ao objeto...
    // Todos os produtos terão 25% de desconto
    // Se for natal ou dia das mães, entra 35% de desconto
    // O preço varia para todos os produtos, sem exceção
    String nome;
    double preco;
    static double desconto = 0.25;

    ProdutoAtividade(){ // Construtor padrão. Se criar outro, ele é perdido.

    }

    ProdutoAtividade(String nomeInicial){
        nome = nomeInicial;
    }

    ProdutoAtividade(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {   // não precisa de parâmetro porque já tem os dados que precisam receber
        return preco * (1 - desconto);
    }


    }
