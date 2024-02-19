package oo.heranca.testeHeranca;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {
    public static void main(String[] args) {

        Carro ferrari = new Ferrari(400);

        Carro civic = new Civic();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

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
