package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidação {

    public static void main(String[] args) {

        try {
            Aluno a = new Aluno("Gu", 10);
            Validar.aluno(a);
            Validar.aluno(null);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }



    }
}
