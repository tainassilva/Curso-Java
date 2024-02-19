package oo.encapsulamento.casaA;

import org.w3c.dom.ls.LSOutput;

import javax.imageio.stream.ImageInputStream;

public class Paulo {
    void testesAcessos(){
        Ana esposa = new Ana();

        // Não pode ser acessado pois é privado pela própria classe Ana
        //System.out.println(esposa.segredo);

        // Dentro do mesmo pacote
        System.out.println(esposa.facoDentroDeCasa);

        // É dentro do mesmo pacote ou consigo herdar de outro pacote atributos e comportamentos
        System.out.println(esposa.formaDeFalar);

        // Todos conseguem acessar os atributos
        System.out.println(esposa.todosSabem);
    }
}
