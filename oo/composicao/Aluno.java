package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
        // Não pode criar outro objeto porque ele é uma constante
        // this.cursos = new ArrayList<Curso>();
    }

    void adicionarCurso(Curso curso){
//        aluno1.adicionarCurso(curso1) => curso 1 é o paramentro e aluno1 é o objeto
//        que chama a função, ou seja é o this passado como parametro na função que você citou.
        this.cursos.add(curso);
        curso.alunos.add(this); //referencia a própria classe
    }

    Curso obterCursoPorNome(String nome){
        for(Curso curso: this.cursos){
            // Verifica se o curso que foi passado por parametro existe.
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }


    //Tranformando um objeto em uma string
    public String toString(){
        return nome;
    }
}
