package classe;

public class Produto {
	// Pertencem ao objeto...
	String nome;
	double preco;
	double desconto; 
	
	Produto(){ // Construtor padrão. Se criar outro, ele é perdido.
		
	}

	Produto(String nomeInicial){
	nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {   // não precisa de parâmetro porque já tem os dados que precisam receber
		return preco * (1 - desconto);
	}
		double descontoDoGerente(double descontoAdicional) { // parâmetro que vai ser colocado na classe principal
			return preco * (1 - desconto + descontoAdicional);
		
	}
	
}
