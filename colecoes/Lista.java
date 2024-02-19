package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        // Assim não dá certo, tem que criar o objeto toda vez que adicionar uma pessoa
//        Usuario u1 = new Usuario();
//        listaUsuarios.add(u1.nome("aba"));

        Usuario u1 = new Usuario("Ana");

        //Tem que colocar em qual lista vai ser adicionada
        listaUsuarios.add(u1);
        listaUsuarios.add(new Usuario ("Carlos"));
        listaUsuarios.add(new Usuario ("Lia"));
        listaUsuarios.add(new Usuario ("Bia"));
        listaUsuarios.add(new Usuario ("Manu"));

        // Vai exibir o índice indicado no topo da lista (Bia)
        System.out.println(listaUsuarios.get(3));

        // Removendo objetos
        System.out.println(">>>>>" +listaUsuarios.remove(1)); // Retorna como int e mostra o Usuario
        listaUsuarios.remove(new Usuario("Manu")); // Retorna como booleano

        // Vê se determinado valor contêm na lista. Retorna booleano.
        System.out.println("Tem?  " + listaUsuarios.contains(new Usuario("Lia")));
        //tem que fazer um for para percorrer a lista
//        System.out.println(listaUsuarios);

        for(Usuario u : listaUsuarios){
            // Tem que colocar qual dado quer acessar
            System.out.println(u);
        }
    }
}
