package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opc = "s";

        while (opc.equals("s")){
        System.out.println("-----------------------############-----------------------");
        System.out.println("Quantas notas deseja informar? ");
        int quantidadeNotas = 0;
        quantidadeNotas = scan.nextInt();
            if (quantidadeNotas != 0) {
        System.out.printf("\nOk, criamos o array de %d posições. Insira os valores abaixo: \n", quantidadeNotas);
        double[] arrayNotas = new double[quantidadeNotas];
                int i = 1;
                double total = 0;
                for (double nota: arrayNotas) {
                    System.out.printf("\n Por gentileza, insira a Nota%d:", i);
                    nota = scan.nextDouble();
                    total += nota;
                    System.out.println(i);
                    i++;
                }
                System.out.println("A media das notas foi: " + total / arrayNotas.length);
            }
            System.out.println("-----------------------############-----------------------");
            System.out.println("Deseja calcular outra media? S - sim | N - Não");
            opc = scan.next().toLowerCase().trim();

        }
    scan.close();
    }


}
