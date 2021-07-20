package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos alunos? ");
        int qtdAlunos = scan.nextInt();

        System.out.println("Quantas notas? ");
        int qtdNotas = scan.nextInt();

        double total = 0;
        double[][] notasTurma = new double[qtdAlunos][qtdNotas];
        for (int a = 0; a < notasTurma.length; a ++){
            for (int n = 0; n < notasTurma[a].length; n ++){

                System.out.printf("Informe a Nota(%d) do Aluno %d: ", n + 1, a + 1);
                notasTurma[a][n] = scan.nextDouble();
                total += notasTurma[a][n];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("A media da turma é: " + media);

        for (double[] notasDoAluno : notasTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        scan.close();
    }
}
