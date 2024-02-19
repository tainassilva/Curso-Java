package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapa {
    public static void main(String[] args) {

        // Chave e valor
        Map <Integer, String> usuarios = new HashMap<>();


//        // Coloca dois valores na lista
//        usuarios.put(1, "Roberto");
//
//        // Substitui o valor da chave 1
//        usuarios.put(1, "Ricardo");
//        System.out.println(usuarios.size()); //1 , pois as chaves não podem ser duplicadas

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size()); // 4
        System.out.println(usuarios.isEmpty()); // false

        System.out.println(usuarios.keySet()); // Chave
        System.out.println(usuarios.values()); // Valor
        System.out.println(usuarios.entrySet()); // Chave e valor

        System.out.println(usuarios.containsKey(1)); // Se contem a chave
        System.out.println(usuarios.containsValue("Roberto")); // Se contêm o valor

        System.out.println(usuarios.get(4)); //Retorna o valor que contêm na chave

        //So remove com a chave ou com chave e valor

        System.out.println(usuarios.remove(1));
        //System.out.println(usuarios.remove("Rebeca"));
        System.out.println(usuarios.remove(4, "gui")); // Falso, pois não é correspondente a chave 4

        //Percorrendo a lista

        // Mostra todas as chaves da lista(Não é exibido na ordem)
        for(int chave : usuarios.keySet()){
            System.out.println(chave);
        }

        // Mostra todas os valores da lista
        for(String valor : usuarios.values()){
            System.out.println(valor);
        }

        // Mostra chave e valor da lista
        for (Entry<Integer,String> chaveEValor: usuarios.entrySet()){
            System.out.println(chaveEValor.getKey());
            System.out.println(chaveEValor.getValue());
        }
    }

}
