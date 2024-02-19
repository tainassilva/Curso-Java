package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final List<Aluno> alunos = new ArrayList<oo.composicao.Aluno>();

    Curso(String nome){
        this.nome = nome;
    }

    void adicionarAluno(oo.composicao.Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

}
