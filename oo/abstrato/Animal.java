package oo.abstrato;

public abstract class Animal {
    public String respirar(){
        return "Usando oxigênio";
    }

    // Abstract eu não preciso implementar o método pois cada animal tem seu jeito de andar
    // Não sei como implementar esse método... Não generalizando o método mover
    public abstract String mover ();

}
