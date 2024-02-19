///**
// *  Vai ter a classe main, ele vai instanciar uma pessoa
// * Duas comidas e essa pessoa vai comer a comida
// * Nome da comida(Dentro do próprio construtor), peso da comida
// * Cria uma segunda comida...
// * Cria uma pessoa, que espera receber comida e ai esse peso da comida é somado com o peso da pessoa
// * Mostrar o peso antes e depois de comer
// **/
//package classe.Desafio;
//
//import java.util.Scanner;
//
//public class Jantar {
//    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite o seu nome: ");
//        String nomePessoa = entrada.nextLine();
//
//        System.out.println("Digite o seu peso: ");
//        double meuPeso= entrada.nextDouble();
//
//        Pessoa descricao = new Pessoa();
//        descricao.nome = nomePessoa;
//        descricao.peso= meuPeso;
//
//        System.out.println("Digite o nome do primeiro alimento: ");
//        String nomePrimeiroAlimento = entrada.next();
//
//        System.out.println("Agora digite o peso dele: ");
//        double pesoPrimeiroAlimento = entrada.nextDouble();
//
//        System.out.println("Digite o nome do segundo alimento: ");
//        String nomeSegundoAlimento = entrada.next();
//
//        System.out.println("Agora digite o peso dele: ");
//        double pesoSegundoAlimento = entrada.nextDouble();
//
//       Pessoa comendoMuito = new Pessoa();
//       double pesoAposComer = comendoMuito.comer(pesoPrimeiroAlimento,pesoSegundoAlimento, meuPeso);
//
//        System.out.println("Seu nome é " + nomePessoa + " e você comeu " +nomePrimeiroAlimento+ " e " +nomeSegundoAlimento);
//        System.out.println("O meu peso antes de comer é: " + meuPeso);
//        System.out.println("Meu peso após comer é: " + pesoAposComer);
//
//
//
//
//
//    }
//}
