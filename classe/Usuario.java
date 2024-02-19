package classe;

import java.util.Objects;

// Classe manipulada na classe EqualHashcode
public class Usuario {
    String nome;
    String email;


    public boolean equals(Object objeto) { // Todos são descendentes da classe Object
        // O objeto que foi passado, é uma instância da classe Usuario?
        if(objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }
    // O hashcode sera abordado em outra classe
}







