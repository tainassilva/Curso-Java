package oo.heranca.desafio;

/*
* Crie dois carros específicos que vão herdar de carro
* O carro vai ter uma velocidade atual, método acelerar e frear
* A velocidade nunca será menor que zero e o método acelerar e frear é sem parâmetro
* Acrescentar de 5 em 5
* A ferrari acelera mais rápido, acelera de 15 em 15 KM/H
* O civic vai ser acelerado normalmente
* No fim, crie a classe main para testar os métodos
* */
public class Carro {

    // Não vai mudar, pode deixar publico
    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;
    private int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += getDelta();
        }

    }
    public void frear(){
        if(velocidadeAtual >= 5 ) {
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }
    public int getDelta() {
        return delta;
    }
    public void setDelta(int delta) {
        this.delta = delta;
    }
}
