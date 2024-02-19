package oo.composicao;

public class CarroTesteUmPraUm {
    public static void main(String[] args) {
        Carro carro = new Carro();

        // Verifica se o carro está ligado
        System.out.println(carro.estaLigado()); // Inicia com falso

        //Liga o carro
        carro.ligar(); // Chama o ligado para true
        System.out.println(carro.estaLigado());

        // Acessando a outra classe que não foi instanciada
        // mas ela foi instanciada dentro de Carro
        // Tudo que estiver em Carro, pode usar os métodos
        System.out.println(carro.motor.giros());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println(carro.motor.giros());

        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();

        System.out.println(carro.motor.giros());

        // Pode acabar indo para um valor negativo
        // foi feito uma condição para prevenir o valor negativo
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();

        // Faltou encapsulamento!!!
        // carro.motor.fatorInjecao = -30;

        System.out.println(carro.motor.giros());

        // Relação bidirecional
        System.out.println(carro.motor.carro.motor.carro.motor.carro.motor.giros());



    }
}
