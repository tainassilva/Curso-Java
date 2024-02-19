package lambda;

public class CalculoTeste2 {
    public static void main(String[] args) {

        // Atribui a classe a uma variável
        // O lambda tem o símbolo ->
        // A variável calc recebe atributos da classe Calculo
        // Após o símbolo lambda, recebe o seu comportamento
        // Bate com a função e parâmetros dentro da interface Calculo
        // Daí não precisa da classe somar e multiplicar

        // Dentro do par de chaves é obrigado a associar um return
        // Pode reber mais de uma setença de código
        Calculo calc = (x, y) -> {
            double a = x + y;
            return a;
        };
        System.out.println(calc.executar(2,3));

        // Implicitamente existe um return associado
        // Não pode associar mais de uma setença de código
        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2,3));

        // Obrigatoriamente tem que bater com os parâmetros da interface
        //Calculo calc = (x) -> {return x + y}; // errado
        //Calculo calc = (x, y) -> {return x;}; // Pode retornar apenas um valor

        System.out.println(calc.legal());
        System.out.println(Calculo.muitoLegal());
    }

}
