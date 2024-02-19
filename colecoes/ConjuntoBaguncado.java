package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        // O hashset não aceita tipos primitivos, transformando os atributos em classe
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); //String
        conjunto.add(1); // int -> Int
        conjunto.add('X'); // char -> Char

        System.out.println("Tamanho é: " + conjunto.size());

        // Vai ser adicionado porque o t é minúsculo
        conjunto.add("teste");
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("amora")); // false
        // Verdadeiro, porque essa string existe na lista
        System.out.println(conjunto.remove("Teste"));

        // Verifica se determinado valor está dentro do conjunto
        System.out.println(conjunto.contains("Teste"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        // Mostra o conjunto dos números
        System.out.println(nums);

        // Unindo os dois conjuntos
        //conjunto.addAll(nums);

        // Valores em comum (interseção)
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        //Esvazia a lista
        conjunto.clear();
        System.out.println(conjunto);
    }
}
