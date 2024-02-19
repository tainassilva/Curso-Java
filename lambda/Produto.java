package lambda;

// Não precisa usar o extends Object porque sem nada ele já entra
// A classe mãe de todas as classes é o Object
public class Produto extends Object {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        // Pode chamar de forma explícita o super mas não necessita
        // super();
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
        public String toString(){
            double precoFinal = preco * (1 - desconto);
            return nome + " tem o preço inicial de " + preco +
                    ". Com o desconto fica no preço de " + precoFinal + "\n";
    }
}
