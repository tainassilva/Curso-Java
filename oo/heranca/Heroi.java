package oo.heranca;

// Herda atributos e comportamentos da classe Jogador
public class Heroi extends Jogador{

    public Heroi(int x, int y){
        super(x,y);
    }
    public boolean atacar(Jogador oponente){
        // O super chama o método pai para atacar ao invés de sobrescrever
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2= super.atacar(oponente);
        boolean ataque3= super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
        // Tirando 30 vidas
    }


//    // Sobrescrevendo o método atacar
//    boolean atacar(Jogador oponente){
//        int deltaX =Math.abs( x- oponente.x);
//        int deltaY =Math.abs( y- oponente.y);
//
//        // O herói tem um ataque mais forte
//        if(deltaX == 0 && deltaY == 1) {
//            oponente.vida -= 20;
//            return true;
//        } else if (deltaX == 1 && deltaY == 0) {
//            oponente.vida -=20;
//            return true;
//        }else{
//            return false;
//        }
//    }


}
