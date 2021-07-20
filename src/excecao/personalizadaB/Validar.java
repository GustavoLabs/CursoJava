package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {

    private Validar(){

    }

    public static void aluno (Aluno aluno)  {
        try {
            if(aluno == null){
                throw new IllegalArgumentException("O aluno está nulo!");
            }

            if (aluno.nome == null || aluno.nome.trim().isEmpty()){
                throw new StringVaziaException("nome");
            }

            if(aluno.nota < 0 || aluno.nota > 10){
                throw new NumeroForaIntervaloException("nota");
            }
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            e.printStackTrace();
        }

    }
}
