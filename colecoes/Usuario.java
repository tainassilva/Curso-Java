package colecoes;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome){
         this.nome= nome;
    }

    // Exibe o nome sem exibir o valor de memória
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        // return this.nome.length

        // Verifica se é um objeto
        if (this == o) return true;
        // Verifica se está instanciando da classe Usuario
        if (!(o instanceof Usuario usuario)) return false;
        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
