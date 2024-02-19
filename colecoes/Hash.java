package colecoes;

import java.util.HashSet;

public class Hash {
    // Lista que dá problema sem o hashSet -> HashSet
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("'Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        //Se eu tiro o hashCode, retorna falso
        // Ele compara o número de letras que contêm na palavra, e é mais rápido
        // Após fazer o hashCode, ele vai para o equals
        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(resultado);

    }
}
