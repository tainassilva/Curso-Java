package classe;

public class Equals {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();
        usuario1.nome = "Taina santos";
        usuario1.email = "taina@gmail.com";

        Usuario usuario2 = new Usuario();
        usuario2.nome = "Taina santos";
        usuario2.email = "taina@gmail.com";

        //False, pois compara endereços de memória
        System.out.println(usuario1 == usuario2);

        // Vai funcionar como o ==
        System.out.println(usuario1.equals(usuario2));

    }
}
