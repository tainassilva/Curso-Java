package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;
        /*
        * 1. A partir do produto, calcular o preço real(Com desconto)
        * 2. Imposto municipal: >= 2500(8.5%) || < 2500 (Isento)
        * 3. Frete : >= 3000 (100) || < 3000 (50)
        * 4. Arredondar: Deixar duas casas decimais
        * 5. Formatar: R$ 1234.56
         */

public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco + (preco * 0.085) : preco;

        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco).replace(',', '.'));

        Function<Double, String> formatar = preco -> String.format("R$%.2f", preco);

        Produto p = new Produto("Ipad", 3235.89, 0.3);
        String precoFormatado = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é " + precoFormatado);


//        double desconto = p.preco * (1- p.desconto);
//        System.out.printf("Preço com desconto: R$%.2f", desconto);

        // Cálculo do desconto
//        BinaryOperator<Double> desconto =
//                (valorNormal, valorDesconto) -> valorNormal * (1 - valorDesconto);
//
//        Function<Double,Double> impostoMunicipal =
//                valorProduto -> valorProduto >= 2500 ? valorProduto * 0.85 : valorProduto;
//
//        Function<Double,Double> frete =
//                valorFrete -> valorFrete >= 300 ? valorFrete + 100 : valorFrete + 50;
//
//        double valorFinal = desconto
//                .andThen(impostoMunicipal)
//                .andThen(frete)
//                .apply(p.preco,p.desconto);
//
//        System.out.printf("Valor original do %s: R$%.2f\nValor com desconto de %.2f: R$%.2f\n " +
//                "Valor com imposto municipal : R$%.2f\n" +
//                "valor com frete: R$.2f" , p.nome,p.preco, p.desconto,desconto.andThen(impostoMunicipal).andThen(frete).apply(p.preco, p.desconto));
    }

}
