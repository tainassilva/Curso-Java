package oo.heranca;

public class Jogador {

    public int x;
    public int y;
    public int vida = 100;

    public Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean atacar(Jogador oponente){
        // Se o absoluto der -1, ele entende como 1
        // Distancia que um jogador está do outro
        int deltaX =Math.abs( x- oponente.x);
        int deltaY =Math.abs( y- oponente.y);

        // Se o jogador e o oponente tem os mesmos valores, eles estão no mesmo lugar
        if(deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -=10;
            return true;
        }else{
            return false;
        }
    }
    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
}
//    boolean andar(Direcao direcao){
//        if(direcao == Direcao.NORTE){
//            y++;
//        }
//        return true;
//    }
//boolean andar(int direcao){
//    if(direcao == 1){
//        y++;
//    }
//    return true;
//}



