package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double num1 = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double num2 = scan.nextDouble();

        System.out.print("Digite a operação desejada: ");
        String op = scan.next();


        double operation = "+".equals(op) ? num1 + num2 : 0;
        operation = "-".equals(op) ? num1 - num2 : operation;
        operation = "*".equals(op) ? num1 * num2 : operation;
        operation = "/".equals(op) ? num1 / num2 : operation;
        operation = "%".equals(op) ? num1 % num2 : operation;

        String resultado = String.format("%.2f %s %.2f = %.2f", num1, op, num2, operation);

        System.out.println(resultado);

    }
}
