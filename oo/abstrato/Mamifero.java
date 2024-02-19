package oo.abstrato;

// Não precisa definir corpo de métodos em classes abstratas
public abstract class Mamifero extends Animal{

    // Todos os mamíferos tem o método mamar mas não sei como implementar
    public abstract String mamar();

//    // Evita que o método seja sobrescrito em qualquer classe
//    public final String mover(){
//        return "Saindo do lugar";
//    }

    public String mover(){
        return "Saindo do lugar";
    }
}
