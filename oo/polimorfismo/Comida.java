package oo.polimorfismo;

// cLASSE MÃE QUE MANDA ATRIBUTOS E MÉTODOS PARA AS OUTRAS CLASSES
public abstract class Comida {
    private double peso;

    public Comida(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
