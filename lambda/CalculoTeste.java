package lambda;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2,3));

        // Polimorfismo
        calculo = new Multiplicar();
        System.out.println(calculo.executar(2,3));


    }
}
