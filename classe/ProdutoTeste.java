package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		// O new cria um novo objeto e a notação ponto 
		//Serve para chamar os membros ...
		Produto produto = new Produto();
		produto.nome = "Caneta preta";
		produto.preco = 12.56;
		produto.desconto = 0.29;
		
		Produto produto2 = new Produto("Notebook");
		produto2.preco = 4356.89;
		produto2.desconto = 0.25;
		
	
		
		Produto produto3 = new Produto("Máquina de lavar", 5300.99);
		produto.desconto = 0.12;
		
		// Imprime os valores que foram atribuidos
		System.out.println(produto.nome); 
		System.out.println(produto2.nome);  
		System.out.println(produto3.nome);  
		
		//Valores com desconto com o uso do método precoComDesconto
		double precoFinal1= produto.precoComDesconto();
		double precoFinal2 = produto2.precoComDesconto();
		double precoFinal3 = produto3.precoComDesconto();
		
		//Valores que tem parâmetro definido na classe principal
		double precoFinal4 = produto.descontoDoGerente(0.1);
		double precoFinal5 = produto2.descontoDoGerente(0.15);
		double precoFinal6 = produto3.descontoDoGerente(0.15);
		
		
		System.out.println("Valor com desconto: " + produto.nome+ "= " + precoFinal1);
		System.out.println("Valor com desconto: " + produto2.nome+ "= " + precoFinal2);
		System.out.println("Valor com desconto: " + produto3.nome+ "= " + precoFinal3);
		System.out.println("Valor com desconto do gerente: " + produto.nome+ "= " +precoFinal4);
		System.out.println("Valor com desconto do gerente: " + produto2.nome+ "= " + precoFinal5);
		System.out.println("Valor com desconto do gerente: " + produto3.nome+ "= " + precoFinal6);
		
		
		
		
		
	}
}
