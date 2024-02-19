package oo.composicao;

public class Motor {

    boolean ligado  = false;
    double fatorInjecao = 1; //Giro do motor. Quanto mais acelera, aumenta o giro.
    final Carro carro; // Não muda a referência

    Motor(Carro carro){
        this.carro = carro;
    }
    int giros(){
        //Se não estiver ligado, não tem giro nenhum
        if(!ligado){
            return 0;
        }
        // Arredonda o valor dos giros
        return (int)Math.round(fatorInjecao * 3000);
    }
}
