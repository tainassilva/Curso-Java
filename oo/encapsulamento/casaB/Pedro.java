package oo.encapsulamento.casaB;

// Tem que importar porque está em outro pacote
import oo.encapsulamento.casaA.Ana;
import org.w3c.dom.ls.LSOutput;

public class Pedro extends Ana {

    void testeAcessos() {

        // Não instancia o objeto porque o protectec é acessado por herança
        //Ana mae = new Ana();

        // Não pode ser acessado pois é privado pela própria classe Ana
        //System.out.println(esposa.segredo);

        // Não está dentro do mesmo pacote da Ana
        //System.out.println(mae.facoDentroDeCasa);

        // É dentro do mesmo pacote ou consigo herdar de outro pacote atributos e comportamentos
        // Acessado via herança
        //System.out.println(new Ana().formaDeFalar);
        System.out.println(formaDeFalar);

        // Todos conseguem acessar os atributos
        System.out.println(new Ana().todosSabem);
        System.out.println(todosSabem);
    }
}
