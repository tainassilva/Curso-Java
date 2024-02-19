package oo.composicao;

// O carro tem um motor e o motor tem um carro
// Unidirecional: O carro tem um motor mas o motor não tem um carro

public class Carro {
    // 1 pra 1 : Dentro de uma classe utiliza atributos de outra classe
    final Motor motor; // Não muda a referência

    Carro(){
        // O próprio objeto atual é o que eu vou usar para construir o motor
        this.motor = new Motor(this);
    }

    void acelerar(){
        // Se o valor de giro for menor que 2.6, continua acelerando
        // mas se o valor for maior, não faz nada
        if(motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }
    void frear(){
        // Se o valor de giro for maior que 0.5, continua freando
        // mas se o valor for menor, não faz nada
        if(motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }
    boolean estaLigado(){
        return motor.ligado;
    }




}
