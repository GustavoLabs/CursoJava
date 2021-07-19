package controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a média: ");
        double media = scan.nextDouble();

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }


        scan.close();


    }
}
