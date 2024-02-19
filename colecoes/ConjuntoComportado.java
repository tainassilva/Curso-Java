package colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        // Pode colocar vários tipos misturados
        //HashSet listaAprovados = new HashSet();

        // Gera uma lista que obrigatoriamente tem que ter o tipo String
        // Essa lista não é ordenada
//      HashSet<String> listaAprovados = new HashSet<>();

        //Lista que aceita ordenação
        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato : listaAprovados){
            System.out.println(candidato);
        }

        // Não aceita tipos primitivos, tem que usar o whappers
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(120);
        numeros.add(6);

        for(int n: numeros){
            System.out.println(n);
        }




    }
}
