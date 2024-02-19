package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
    void testesAcessos(){
        Ana sogra = new Ana();

        // Não pode ser acessado pois é privado pela própria classe Ana
        //System.out.println(sogra.segredo);

        // Dentro do mesmo pacote
        //System.out.println(sogra.facoDentroDeCasa);

        // É dentro do mesmo pacote ou consigo herdar de outro pacote atributos e comportamentos
        // Acessado via herança
        // System.out.println(sogra.formaDeFalar);

        // Todos conseguem acessar os atributos
        System.out.println(sogra.todosSabem);
    }
}
