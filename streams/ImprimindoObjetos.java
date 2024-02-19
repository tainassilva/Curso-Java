package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

//        for(int i = 0 ; i < aprovados.size(); i++){
//            System.out.println(aprovados.get(i));
//        }

        System.out.println("Usando o foreach");
        for(String nome : aprovados){
            System.out.println(nome);
        }
        /*
        Interface do java que contêm dois métodos:
        Retorna verdadeiro ou falso-> Existe outro elemento dentro dessa lista?
         */
        System.out.println("\nUsando iterator");
        Iterator<String> iterator = aprovados.iterator();
        // Enquanto estiver um próximo elemento
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Stream");
        // Sequência de dados que vai passar determinada informação
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno...




    }
}

