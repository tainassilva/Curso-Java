package oo.encapsulamento;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class PessoaTeste {
    public static void main(String[] args) {

        // A visibilidade public te dá a possibilidade de colocar valores indesejados
        // Teve um tratamento para não aceitar idades negativas, chamando o método alterar idade
        PessoaIdade p1 = new PessoaIdade("Taina","Santos Silva", -30);

        // Idade inválida, pois só aceita do 0 aos 120 anos
        p1.setIdade(230);
        // Mas se eu fizer assim, pode funcionar a idade negativa
        //PessoaIdade p1 = new PessoaIdade(-30);
        //p1.idade = -30; // Altera a variável se fosse public

        System.out.println(p1.getIdade()); // Lê a variável atraveés do método da classe PessoaIdade
        System.out.println(p1); // toString
        System.out.println(p1.getNomeCompleto());
    }
}
