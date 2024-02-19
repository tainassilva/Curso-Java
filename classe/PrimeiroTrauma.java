package classe;

public class PrimeiroTrauma {
    int a = 3; // Para acessar ele, tem que criar uma instância
    static int b = 5;

    public static void main(String[] args) {
        // fazer com que exiba o a no console
        PrimeiroTrauma valor = new PrimeiroTrauma();

        System.out.println(valor.a);
        System.out.println(b); // Algo estático pode acessar algo estático

    }
}
