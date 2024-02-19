package oo.abstrato;

public class Cachorro extends Mamifero{

    // Tem que obrigatoriamente implementar os métodos abstratos
    // Pode sobrecrever os métodos concretos

    // Não pode sobrescrever o método final
    @Override
    public String mover(){
        return "Usando as patas";
    }

    // Método abstrato implementado
    @Override
    public String mamar() {
        return "Usando leite";
    }
}
