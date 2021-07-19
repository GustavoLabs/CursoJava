package controle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opc = "s";

        while(opc.equalsIgnoreCase("s")) {

            System.out.print("Qual dia deseja saber?");
            String diaSemana = scan.nextLine();

            if (diaSemana.equalsIgnoreCase("Domingo")) {
                System.out.println("1");
            } else if (diaSemana.equalsIgnoreCase("Segunda")) {
                System.out.println("2");
            } else if (diaSemana.equalsIgnoreCase("Terça")) {
                System.out.println("3");
            } else if (diaSemana.equalsIgnoreCase("Quarta")) {
                System.out.println("4");
            } else if (diaSemana.equalsIgnoreCase("Quinta")) {
                System.out.println("5");
            } else if (diaSemana.equalsIgnoreCase("Sexta")) {
                System.out.println("6");
            } else if ((diaSemana.equalsIgnoreCase("Sábado"))) {
                System.out.println("7");
            } else {
                System.out.println("Dia inválido");
            }
            System.out.println("------------------------------------------------------");
            System.out.println("Deseja verificar outro dia?");
            System.out.println("S- sim | N - Não");
            opc = scan.nextLine();
        }
        scan.close();
    }
}
