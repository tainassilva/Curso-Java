package oo.heranca.desafio;

import org.w3c.dom.ls.LSOutput;

public class TesteCarro {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(400);
        // Se eu colocar Carro Ferrari, e não consigo usar o implements

        Carro civic = new Civic();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        // Tem o pior desemoenho
        ferrari.ligarAr();
        // de 30 em 30 porque o ar está ligado
        ferrari.ligarTurbo();
        // Desliga o ar e deixa o carro na potência máxima
        ferrari.desligarAr();

        System.out.println(ferrari.velocidadeDoAr());

        // 35KM/H, pois freou 2 vezes e acelerou 3 vezes
        ferrari.frear();
        ferrari.frear();

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();

        civic.frear();
        civic.frear();
        civic.frear();
        // Não freia mais, pois não chega a velocidade negativa
        civic.frear();

        System.out.printf("Velocidade atual da Ferrari: %d KM/H \n",ferrari.velocidadeAtual);
        System.out.printf("Velocidade atual do Civic: %d KM/H" ,civic.velocidadeAtual);
    }
}
