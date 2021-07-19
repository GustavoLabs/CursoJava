package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    void addCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso searchCurse(String nome){
        for (Curso curso : this.cursos){
            if (curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    public String toString(){
        return "Meu nome é " + this.nome;
    }


}
