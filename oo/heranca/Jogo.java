package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro(10,10);
        // O ruim de não ter o enum é ter que saber o nome e números das posições

        // A classe herói herdando de jogador
        Heroi heroi = new Heroi(10,11);


        System.out.printf("Monstro tem %s vidas\n", monstro.vida);
        System.out.printf("Herói tem %s vidas\n",heroi.vida);

        //o jogador 2 está na mesma posição do jogador 1, perdendo uma vida
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println(); 
        // Atacando duas vezes acima e aqui ele sai de perto do herói
        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.printf("Monstro tem %d vidas\n", monstro.vida);
        System.out.printf("Herói tem %d vidas\n",heroi.vida);

        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.LESTE);
        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.LESTE);
//        j1.andar("norte");
//        j1.andar("norte");
//        j1.andar("norte");
//        j1.andar("norte");

//        // Talvez também não seja uma maneira interessante porque não é claro
//        j1.andar(1);
//        j1.andar(1);
//        j1.andar(1);
//        j1.andar(1);

        System.out.println(monstro.y);
        System.out.println(monstro.x);


    }
}
