package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Gustavo");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Henrique");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Web");
        Curso curso3 = new Curso("React");

        curso1.addStudent(aluno1);
        curso1.addStudent(aluno2);

        curso2.addStudent(aluno1);
        curso2.addStudent(aluno3);

        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Eu sou o(a): " + aluno.nome + " e estou no curso: " + curso1.nome);
        }

        System.out.println(aluno1.cursos.get(1).alunos);


        Curso cursoEncontrado = aluno1.searchCurse("React");

        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }


    }
}
