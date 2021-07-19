package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seus ultimos três salários: ");
        String num1 = scan.nextLine().replace(",", ".");
        String num2 = scan.nextLine().replace(",", ".");
        String num3 = scan.nextLine().replace(",", ".");
        double d1 = Double.parseDouble(num1);
        double d2 = Double.parseDouble(num2);
        double d3 = Double.parseDouble(num3);
        System.out.println(num1 + num2 + num3);
        double media = (d1 + d2 + d3) /3;

        System.out.printf("A media dos salários é: " + media);
    }
}
